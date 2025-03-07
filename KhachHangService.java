package com.example.demo.service;

import com.example.demo.entity.KhachHang;


import java.util.List;

public class KhachHangService {
        private List<KhachHang> danhSachKhachHang;

        public KhachHangService(List<KhachHang> danhSachKhachHang) {
            this.danhSachKhachHang = danhSachKhachHang;
        }

        public void khachHangtn(KhachHang khachHang){
            if (khachHang.getTenKH() == null || khachHang.getTenKH().trim().isEmpty()){
                throw new IllegalArgumentException("không được để trống tên khách hàng");
            }
        }

        public KhachHang timKhachHangTheoMa(String maKH) {
            for (KhachHang kh : danhSachKhachHang) {
                if (kh.getMaKH().equals(maKH)) {
                    return kh;
                }
            }
            return null;
        }
    }


