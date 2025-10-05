package cli;

import algorithms.Kadane;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        double[] times = new double[sizes.length];
        int[] maxSums = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            int[] array = generateRandomArray(size);
            long startTime = System.nanoTime();

            Kadane.Result result = Kadane.maxSubarraySum(array);

            long endTime = System.nanoTime();
            double durationMs = (endTime - startTime) / 1_000_000.0;

            times[i] = durationMs;
            maxSums[i] = result.maxSum;

            System.out.printf("Input size: %d | Max Sum: %d | Time: %.2f ms | Start: %d | End: %d%n",
                    size, result.maxSum, durationMs, result.start, result.end);
        }

        saveResultsToCSV("docs/performance-plots/kadane_performance.csv", sizes, times, maxSums);
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(2001) - 1000; // Числа от -1000 до +1000
        }
        return arr;
    }

    private static void saveResultsToCSV(String filename, int[] sizes, double[] times, int[] maxSums) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("InputSize,MaxSum,TimeMs\n");
            for (int i = 0; i < sizes.length; i++) {
                writer.write(sizes[i] + "," + maxSums[i] + "," + times[i] + "\n");
            }
            System.out.println("CSV файл успешно сохранён в " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при записи CSV: " + e.getMessage());
        }
    }
}
