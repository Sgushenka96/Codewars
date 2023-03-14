package kata_7;

import kata_8.digitOnDigit;

import java.util.Scanner;

public class nextPerfectSquare {
    /** You might know some pretty large perfect squares. But what about the NEXT one?
     Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
     Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

     If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
     *
     */

    /** Завершите метод findNextSquare, который находит следующий интегральный идеальный квадрат после квадрата, переданного в качестве параметра.
     * Note: Интергральный совершенный квадрат является целым числом n, что sqrt(n) также является целым числом.
     *
     * Если параметр сам по себе не является идеальным квадратом, то его следует вернуть -1. Можно предположить, что параметр неотрицательный.
     *
     */
    public static long findNextSquare(long sq) {
        double temp = 0;
        temp = Math.sqrt(sq);
        if (temp % 1 == 0){
            temp++;
            return (long) (temp*temp);
        }
        else return -1;
    }

    public static void main(String[] args) {
        long input = 0;
        long output = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        input = sc.nextInt();
        output = findNextSquare(input);
        System.out.println("ИТОГ: " + output);

    }
}
