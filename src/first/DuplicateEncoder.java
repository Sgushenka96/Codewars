package first;

import java.util.*;

public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        char[] input_word_array = word.toCharArray();
        StringBuffer word_output = new StringBuffer();
        char[] flag_dupl = new char[word.length()];
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                System.out.println("Сравнение индекса: " + i + " и " + j);
                System.out.println("И их значений: " + input_word_array[i] + " и " + input_word_array[j]);
                if (input_word_array[i] == input_word_array[j]) {
                    count++;
                    System.out.println("Запись #: " + count);
                    flag_dupl[i] = ')';
                    flag_dupl[j] = ')';
                } else {
                    System.out.println("Не совпало");
                }
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (flag_dupl[i] != ')') {
                flag_dupl[i] = '(';
            }
        }
        for (char i : flag_dupl) {
            word_output.append(i);
            System.out.println(i);
        }
        System.out.println();
        word = word_output.toString();
        return word;
    }

    /**
     * 1. Читает входную строку
     * 2. Извлекает символы, которые повторялись
     * 3. Заново читает строку
     * 4. Заменяет уникальные символы на (
     * 5. Заменяет повторяющиеся символы на )
     */
    public static void main(String[] args) {
        String input = "";
        String output = "";
        System.out.println("Введите строку для зашифровки: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        output = encode(input);
        System.out.println(output);
    }
}
