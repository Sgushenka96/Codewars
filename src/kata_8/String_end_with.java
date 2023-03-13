package kata_8;

import java.util.Scanner;

public class String_end_with {
    /** Complete the solution so that it returns true if the first argument(string)
     * passed in ends with the 2nd argument (also a string).

     Examples:
     solution('abc', 'bc') // returns true
     solution('abc', 'd') // returns false
     *
     */
    public static boolean solution(String str, String ending) {
        //ending.length()-e
        System.out.println(" Процедура: \n" +
                "начальный индекс в вызываемой строке: " + (str.length()-ending.length()));
        return str.regionMatches(str.length()-ending.length(), ending, 0, ending.length());
        /** Another solutions:
         * 1#
         * return str.endsWith(ending);
         *
         * 2#
         *
         */
    }
    public static void main(String[] args) {
        String str;
        String ending;
        boolean logic = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        str = sc.nextLine();
        System.out.println("Введите конец строки: ");
        ending = sc.nextLine();
        logic = String_end_with.solution(str, ending);
        System.out.printf("Итог: " + logic);
    }
}
