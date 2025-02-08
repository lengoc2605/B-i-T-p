package com.example.demo.service;

import org.springframework.context.annotation.Profile;

public class TongService {
    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static int tinhChia(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    public static double tinhTrungBinh(int[] numbers) {
        if (numbers.length == 0) {
            throw new ArithmeticException("Danh sách trống");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static int getElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Chỉ mục ngoài phạm vi");
        }
        return arr[index];
    }

//    public static String getName(Profile profile) {
//        if (profile == null) {
//            throw new NullPointerException("Cấu hình rỗng");
//        }
//        return profile.getName();
//    }

    public static int findMinElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng");
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
