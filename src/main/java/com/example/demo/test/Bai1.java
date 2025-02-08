package com.example.demo.test;

import com.example.demo.service.TongService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Bai1 {
    TongService service = new TongService();

    @Test
    public void tinhTich1() {
        assertEquals(20, service.tinhTich(4, 5));
    }

    @Test
    public void tinhTich2() {
        assertEquals(0, service.tinhTich(0, 5));
    }

    @Test
    public void tinhTich3() {
        assertEquals(-15, service.tinhTich(-3, 5));
    }

    @Test
    public void tinhTich4() {
        assertEquals(100, service.tinhTich(10, 10));
    }

    @Test
    public void tinhTich5() {
        assertEquals(1, service.tinhTich(1, 1));
    }

    @Test
    public void tinhTich6() {
        assertEquals(-20, service.tinhTich(-4, 5));
    }

    @Test
    public void tinhTich7() {
        assertEquals(25, service.tinhTich(-5, -5));
    }

    @Test
    public void tinhTich8() {
        assertEquals(0, service.tinhTich(0, 0));
    }

    @Test
    public void tinhTich9() {
        assertEquals(200, service.tinhTich(20, 10));
    }

    @Test
    public void tinhTich10() {
        assertEquals(-50, service.tinhTich(10, -5));
    }
}
