import java.util.*;

public class croc5 {
    public static String normalizePath(String path) {
        Deque<String> stack = new LinkedList<>();

        String[] parts = path.split("/"); // Разделение пути по "/"

        for (String part : parts) {
            if (part.equals("..")) {
                // Если "..", то происходит удаление последнего элемента из стека
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else if (!part.equals(".") && !part.isEmpty()) {
                // Игнорирование ".", пустых строк. Добавление остальные элементы в стек
                stack.addLast(part);
            }
        }

        StringBuilder normalizedPath = new StringBuilder(); // Нормализованный путь из элементов стека
        while (!stack.isEmpty()) {
            normalizedPath.append("/").append(stack.removeFirst());
        }

        return normalizedPath.length() > 0 ? normalizedPath.toString() : "/";
    }

    public static void main(String[] args) {
        String path = "КРОК/task_5_2/src/./../../task_5_1/../../../мемы/котики";
        String normalizedPath = normalizePath(path);
        System.out.println(normalizedPath);
    }
}
