package com.example.demo.test;

import com.example.demo.service.TongService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Bai3 {
    TongService service = new TongService();

    @Test
    public void testTinhTrungBinh() {

        assertEquals(5.0, service.tinhTrungBinh(new int[]{5, 5, 5}), 0.01);

        assertEquals(4.5, service.tinhTrungBinh(new int[]{4, 5}), 0.01);

        assertThrows(ArithmeticException.class, () -> service.tinhTrungBinh(new int[]{}));
    }

}
