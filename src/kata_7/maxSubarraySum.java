package kata_7;

import java.util.Arrays;

public class maxSubarraySum {
    /**
     * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
     *  Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
     * // should be 6: {4, -1, 2, 1}
     *
     * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
     * If the list is made up of only negative numbers, return 0 instead.
     *
     * Empty list is considered to have zero greatest sum.
     * Note that the empty list or array is also a valid sublist/subarray.
     */

    /**
     *  Algoryithms
     *  Lists
     *  Dynamic Programming
     *  Fundamentals
     *  Perfomance
     */

    /**
     * Проблема максимальной суммы подмассива заключается в поиске максимальной суммы
     * смежной подпоследовательности в массиве или списке целых чисел.
     *
     * Простой случай, когда список состоит только из положительных чисел, а максимальная сумма является суммой всего массива.
     * Если список состоит только из отриц. чисел, вернуть 0.
     *
     * Пустым списком считается имеющий нулевую наибольшую сумму.
     * Note: пустой список или массив также является допустимым подсписком/подмассивом.
     *
     */

    public static void main(String[] args) {
        int[] in= new int[]{};

    }
    public static int sequence(int[] arr) {
        /**
         * Алгоритм Кадане
         */
        //Checking


        int maxSoFar = 0;   // saving max summing submasive, at now
        int maxEndingHere = 0;  // saving max sum, ending on current pos

        for (int i : arr) {
            maxEndingHere = maxEndingHere + i;  //update max sum submassive, which "ending" on index 'i'

            maxEndingHere = Integer.max(maxEndingHere, 0);  // if max sum is negative, then setting her in 0

            maxSoFar = Integer.max(maxSoFar, maxEndingHere);    // update res, if current summ submas
        }
        return maxSoFar;
    }
}
