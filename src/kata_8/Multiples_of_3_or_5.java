package kata_8;

import java.util.Scanner;

public class Multiples_of_3_or_5 {
    /** If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23.

     * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
     * Additionally, if the number is negative, return 0 (for languages that do have them).

     * Note: If the number is a multiple of both 3 and 5, only count it once.
     *
     */

    /** Если мы перечислим все натуральные числа ниже 10, которые кратны 3 или 5, то получим 3, 5, 6 и 9.
     * Сумма этих кратных равна.

     * Завершите решени так, чтобы оно вернуло сумму всех кратных 3 или 5 НИЖЕ переданного числа.
     * Кроме того, если число отрицательное, вернуть 0.

     * Note: если число кратно 3 и 5, посчитать его только один раз.
     */

    public int solution_Multy3and5(int number) {
        if (number <= 2) return 0;
        int i = 3;
        int temp = 0;
        while (i < number) {
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
                temp += i;
                ++i;
            }
            else ++i;
        }

        System.out.println(temp);
        return number;
    }
    public static void main(String[] args) {
        int input = 0;
        int output = 0;

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        output = new Multiples_of_3_or_5().solution_Multy3and5(input);
    }
}
