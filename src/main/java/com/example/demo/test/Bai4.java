package com.example.demo.test;

import com.example.demo.service.TongService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Bai4 {
    TongService service = new TongService();
    @Test
    public void testGetElementAtIndex() {

        int[] arr = {1, 2, 3, 4};

        assertEquals(2, service.getElementAtIndex(arr, 1));

        assertThrows(IndexOutOfBoundsException.class, () -> service.getElementAtIndex(arr, 5));

    }

}
