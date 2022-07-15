package com.example.megafonhw;

import java.io.IOException;
import java.util.List;

public class Task1 {
    public static List<Object> filterList(final List<Object> list) throws IOException {
        // Проверка на то что список содержит отрицательное число
        if(list.stream().filter(item -> !item.getClass().equals(String.class)).anyMatch(item -> (int)item<0))
            // При наличии отрицательного числа выбрасываем исключение
            throw new IOException("Данный список содержит отрицательное число");
        // Если ошибки нет, убираем строки и возвращаем список чисел
        return list.stream().filter(item -> !item.getClass().equals(String.class)).toList();
    }
}
