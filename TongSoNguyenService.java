package com.example.demo.service;

import com.example.demo.entity.KhachHang;

public class TongSoNguyenService {
        public static int sumArray(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }
    }

