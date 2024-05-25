package com.example.cicd;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CicdApplication {
    public Integer[] readFromFile(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            return arr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int _min(Integer[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int _max(Integer[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int _sum(Integer[] arr) {
        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum;
    }

    public int _mult(Integer[] arr) {
        int mul = 1;
        for (Integer integer : arr) {
            mul *= integer;
        }
        return mul;
    }

    public static void buildGraph() {
        CicdApplication cicdApplication = new CicdApplication();
        List<Integer> sizes = new ArrayList<>();
        List<Long> times = new ArrayList<>();
        for (int i = 1; i <= 1000000; i *= 10) {
            Integer[] arr = new Integer[i];
            for (int j = 0; j < i; j++) {
                arr[j] = j + 1;
            }
            long start = System.currentTimeMillis();
            cicdApplication._mult(arr);
            long end = System.currentTimeMillis();
            sizes.add(i);
            times.add(end - start);
        }
        XYChart chart = new XYChartBuilder().width(800).height(600).title("Mult").xAxisTitle("Size").yAxisTitle("Time, millis").build();
        chart.addSeries("Mult", sizes, times);
        new SwingWrapper<>(chart).displayChart();
    }

    public static void main(String[] args) {
        buildGraph();
    }
}