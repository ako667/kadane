# Kadane's Algorithm Implementation

## Overview

This repository contains a clean and efficient Java implementation of **Kadane's Algorithm** for finding the maximum subarray sum along with the start and end positions of the subarray. The algorithm runs in **O(n)** time and uses **O(1)** auxiliary space.

Kadane's Algorithm is widely used in problems involving maximum sums in linear arrays and is optimal in both time and memory for this task.

---

## How to Run the Benchmark (CLI Usage)

The project includes a command-line interface (CLI) for benchmarking the algorithm with various input sizes and data distributions.

### Running the Benchmark

```bash
java -jar target/assignment2-kadane.jar --size 10000 --type random --trials 5
## CLI Options

| Option   | Description                                  | Default |
|----------|----------------------------------------------|---------|
| --size   | Number of elements in the input array        | 1000    |
| --type   | Input distribution: random, sorted, reverse, nearly_sorted | random  |
| --trials | Number of benchmark repetitions               | 3       |

The benchmark runner outputs performance data to CSV files located in the `docs/performance-plots/` directory.

---

## CSV Output Structure

Each benchmark run produces a CSV file with the following columns:

| Column     | Description                                  |
|------------|----------------------------------------------|
| n          | Input size (number of elements)               |
| type       | Input distribution type                        |
| trial      | Trial number (for repeated runs)               |
| timeNs     | Execution time in nanoseconds                   |
| maxSum     | Maximum subarray sum found by the algorithm    |
| startIndex | Starting index of the maximum subarray          |
| endIndex   | Ending index of the maximum subarray            |

---

## Metrics Explanation

The benchmark tracks key performance metrics to validate theoretical complexity and analyze practical efficiency:

- **Execution Time (timeNs):** Time taken to find the maximum subarray sum, measured in nanoseconds.

- **Maximum Subarray Sum (maxSum):** The highest sum of any contiguous subarray in the input.

- **Start and End Indices (startIndex, endIndex):** The positions of the maximum sum subarray within the input array.

These metrics help confirm that the implementation runs in linear time and correctly identifies the maximum subarray.

---

## Project Structure
assignment2-kadane/
├── src/
│   ├── main/java/algorithms/KadaneAlgorithm.java
│   ├── metrics/PerformanceTracker.java
│   └── cli/BenchmarkRunner.java
├── src/test/java/algorithms/KadaneAlgorithmTest.java
├── docs/
│   ├── analysis-report.pdf
│   └── performance-plots/
│       └── kadane_performance.csv
├── README.md
└── pom.xml
## Contact

For questions or contributions, please open an issue or contact [your_email@example.com].
