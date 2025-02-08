package com.example.demo.test;

import com.example.demo.service.TongService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Bai6 {
    TongService service = new TongService();

    @Test
    public void testFindMinElement() {
        assertEquals(1, service.findMinElement(new int[]{5, 3, 1, 4}));

        assertEquals(-10, service.findMinElement(new int[]{-10, 5, 3, 7}));

        assertThrows(IllegalArgumentException.class, () -> service.findMinElement(new int[]{}));

    }
}
