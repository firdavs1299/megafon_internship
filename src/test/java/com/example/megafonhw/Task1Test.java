package com.example.megafonhw;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1Test {
    @Test
    public void filterList_Test1() throws IOException {
        List<Object> expected= Task1.filterList(List.of(1, 2, "a", "b"));
        List<Object> actual = new ArrayList<>(List.of(1,2));
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void filterList_Test2() throws IOException {
        List<Object> expected = Task1.filterList(List.of(1, 2, "a", "b", 0, 15));
        List<Object> actual = new ArrayList<>(List.of(1,2,0,15));
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void filterList_Test3() throws IOException {
        List<Object> expected = Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
        List<Object> actual = new ArrayList<>(List.of(1,2,231));
        Assert.assertEquals(expected,actual);
    }

}
