package com.example.megafonhw;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        // результаты проверок
        System.out.println(Task1.filterList(List.of(1, 2, "a", "b")));
        System.out.println(Task1.filterList(List.of(1, 2, "a", "b", 0, 15)));
        System.out.println(Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
        //дополнительная проверка на отрицательное число
        System.out.println(Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", -231)));

    }

}
