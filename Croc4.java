package croc4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Croc4 {
    
    public static void main(String[] args) {//Проверка наличия аргумента
        if (args.length == 0) {
            throw new IllegalArgumentException("Не задан путь к файлу");
        }
        // Считываем путь к файлу из аргумента командной строки
        String way = args[0];
        // Создание объекта для пути
        File file = new File(way);

        // Проверка существования файла
        if (!file.exists()) {
            System.out.println("Файл не найден");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int word = 0;

            // Считывание содержимого файла по строкам 
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("[\\s]+");
                word+= words.length;
            }
            System.out.println(word);//Вывод количества слов 
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}