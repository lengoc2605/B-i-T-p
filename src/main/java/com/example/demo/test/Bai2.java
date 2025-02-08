package com.example.demo.test;

import com.example.demo.service.TongService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai2 {
    TongService service = new TongService();

    @Test
    public void tinhThuong1() {
        assertEquals(1, service.tinhChia(5, 5));
    }

    @Test
    public void tinhThuong2() {
        assertEquals(1/2, service.tinhChia(5, 10));
    }

    @Test
    public void tinhThuong3() {
        assertEquals(-1/2, service.tinhChia(5, -10));
    }

    @Test
    public void tinhThuong4() {
        assertEquals(2, service.tinhChia(10, 5));
    }

    @Test
    public void tinhThuong5() {
        Exception exception = assertThrows(ArithmeticException.class, () -> service.tinhChia(10, 0));
        assertEquals("Không thể chia cho 0", exception.getMessage());
    }

    @Test
    public void tinhThuong6() {
        assertEquals(-2, service.tinhChia(-10, 5));
    }

    @Test
    public void tinhThuong7() {
        assertEquals(0, service.tinhChia(0, 5));
    }

    @Test
    public void tinhThuong8() {
        assertEquals(10, service.tinhChia(100, 10));
    }

    @Test
    public void tinhThuong9() {
        assertEquals(-10, service.tinhChia(-100, 10));
    }

    @Test
    public void tinhThuong10() {
        assertEquals(4, service.tinhChia(20, 5));
    }
}

