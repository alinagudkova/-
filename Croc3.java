package croc3;
public class Croc3 {
    //обЪявление компонент 
    private int x;
    private int y;
    
    private static final char[] COLUMN_LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}; //массив символов констант

    public Croc3(int x, int y) {//конструктор
        setX(x);
        setY(y);
    }
    //сеттеры (методы изменения полей класса)+проверка размещения компонент
    public void setX(int x) {
        if (x < 1 || x > 8) {
            throw new IllegalArgumentException("х должен быть в пределах от 1 до 8");
        }
        this.x = x;
    }

    public void setY(int y) {
        if (y < 1 || y > 8) {
            throw new IllegalArgumentException("y должен быть в пределах от 1 до 8");
        }
        this.y = y;
    }

    private char getColumnLetter(int column) {
        return COLUMN_LETTERS[column - 1];
    }

    @Override
    public String toString() {// метод для строкового представления объекта
        char columnLetter = getColumnLetter(x);//буквенное обозначение столбца по числу
        int lineNumber = y;
        return String.format("%c%d", columnLetter, lineNumber);
    }
    
    
    public static void main(String[] args) {
        Croc3 cell1 = new Croc3(2, 3); //создание объекта ячейки
        System.out.println(cell1); //b3
        Croc3 cell2 = new Croc3(0, 8); //создание объекта ячейки
        System.out.println(cell2); //ошибка
    }
    
}
