package croс;
public class Croс {
    public static void main(String[] args) {
         for (int i = 1; i <= 100; i++) { /*перебор числел от 1 до 100*/
            if (i % 3 == 0 && i % 5 == 0) { /*проверка кратности числа на 3 и 5*/
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0 ) { /*проверка кратности числа на 3*/
                System.out.println("Fizz");
            }else if (i % 5 == 0) { /*проверка кратности числа на 5*/
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
