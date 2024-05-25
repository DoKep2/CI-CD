package com.example.cicd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.*;

class CicdApplicationTest {
    public static final String FILE_PATH = "test.txt";
    public final CicdApplication cicdApplication = new CicdApplication();
    @BeforeAll
    static void setUp() {
        File file = new File(FILE_PATH);

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("5\n");
            fileWriter.write("1 2 3 4 5\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void readFromFileTest() {
        Integer[] arr = cicdApplication.readFromFile(FILE_PATH);
        assertEquals(6, arr.length);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
        assertEquals(4, arr[3]);
        assertEquals(5, arr[4]);
    }

    @Test
    void _minTest() {
        Integer[] arr = cicdApplication.readFromFile(FILE_PATH);
        assertEquals(2, cicdApplication._min(arr));
    }

    @Test
    void _maxTest() {
        Integer[] arr = cicdApplication.readFromFile(FILE_PATH);
        assertEquals(5, cicdApplication._max(arr));
    }

    @Test
    void _sumTest() {
        Integer[] arr = cicdApplication.readFromFile(FILE_PATH);
        assertEquals(15, cicdApplication._sum(arr));
    }

    @Test
    void _multTest() {
        Integer[] arr = cicdApplication.readFromFile(FILE_PATH);
        assertEquals(120, cicdApplication._mult(arr));
    }

    @Test
    void _minSpeedTest() {
        Integer[] arr = new Integer[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        cicdApplication._min(arr);
        long end = System.currentTimeMillis();
        assertTrue(end - start < 1000);
    }

    @Test
    void _maxSpeedTest() {
        Integer[] arr = new Integer[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        cicdApplication._max(arr);
        long end = System.currentTimeMillis();
        assertTrue(end - start < 1000);
    }

    @Test
    void _sumSpeedTest() {
        Integer[] arr = new Integer[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        cicdApplication._sum(arr);
        long end = System.currentTimeMillis();
        assertTrue(end - start < 1000);
    }

    @Test
    void _multSpeedTest() {
        Integer[] arr = new Integer[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        long start = System.currentTimeMillis();
        cicdApplication._mult(arr);
        long end = System.currentTimeMillis();
        assertTrue(end - start < 1000);
    }

    @Test
    void readFromFileSpeedTest() {
        File file = new File("speedTest.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("1000000\n");
            for (int i = 0; i < 1000000; i++) {
                fileWriter.write(i + " ");
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        cicdApplication.readFromFile("speedTest.txt");
        long end = System.currentTimeMillis();
        assertTrue(end - start < 10000);
    }
}