package dooh.hh.test1;

/**
 * почему данный код в результте напечатает -6?
 * Не меняя значения a и b измените код, чтобы он вывел выводил арифметически правильное значение суммы
 */

public class One {
    public static void main(String[] args) {
//        int заменил на long - переполнение было
        long a = 0x7ffffffc;
        long b = 0x7ffffffe;
        long c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
