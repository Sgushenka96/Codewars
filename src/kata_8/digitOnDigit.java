package kata_8;

import java.util.Scanner;

public class digitOnDigit {
    /** In this kata, you are asked to square every digit of a number and concatenate them.

     For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

     Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

     Note: The function accepts an integer and returns an integer.

     *
     */

    /** Возвести каждую цифру числа в квадрат и объединить их
     * Пример: input: 9119, output: 811181 (81-1-1-81)
     * Note: функция принимает и возвращает челое число
     *
     */
    public int squareDigits(int n) {
        int temp = 1;
        int output = 0;
        StringBuilder str = new StringBuilder();
        StringBuilder rev_str = new StringBuilder();
        while (n > 0){
            temp = (int) Math.pow((n % 10),2);
            System.out.println("temp = " + temp);
            rev_str.setLength(0);
            rev_str.append(temp);
            str.append(rev_str.reverse());
            System.out.println("реверсивное значение в строке" + str);
            n /= 10;
        }
        n = Integer.parseInt(str.reverse().toString());

        return n;
    }
    public static void main(String[] args) {
        int input = 0;
        int output = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        input = sc.nextInt();
        output = new digitOnDigit().squareDigits(input);
        System.out.println("ИТОГ: " + output);

    }
}
