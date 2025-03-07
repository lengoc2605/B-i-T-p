package com.example.demo.Test;

import com.example.demo.entity.KhachHang;
import com.example.demo.service.KhachHangService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class KhacHangSearch {
    private KhachHangService khachHangService;

    @BeforeEach
    public void setUp() {
        List<KhachHang> danhSachKH = Arrays.asList(
                new KhachHang("KH01", "Nguyen A", 30, "nguyenA@gmail.com", "0123456789"),
                new KhachHang("KH02", "Tran B", 25, "TranB@gmail.com", "0987654321"),
                new KhachHang("KH03", "Le C", 28, "LeC@gmail.com", "0912345678")
        );
        khachHangService = new KhachHangService(danhSachKH);
    }

    @Test
    public void testSearchKhachHangThanhCong() {
        KhachHang kh = khachHangService.timKhachHangTheoMa("KH01");
        assertNotNull(kh);
        assertEquals("Nguyen A", kh.getTenKH());
    }

    @Test
    public void testSearchKhachHangKhongTonTai() {
        KhachHang kh = khachHangService.timKhachHangTheoMa("KH999");
        assertNull(kh);
    }

    @Test
    public void testSearchKhachHangKhongCo() {
        KhachHang kh = khachHangService.timKhachHangTheoMa(null);
        assertNull(kh);
    }

    @Test
    public void testSearchKhachHangRong() {
        KhachHang kh = khachHangService.timKhachHangTheoMa("");
        assertNull(kh);
    }

    @Test
    public void testSearchKhachHangKyTu() {
        KhachHang kh = khachHangService.timKhachHangTheoMa("KH@#");
        assertNull(kh);
    }
}


