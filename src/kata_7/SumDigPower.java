package kata_7;

import java.util.*;

public class SumDigPower {
    /**
     * Число 89 — это первое целое число с более чем одной цифрой, которое выполняет свойство,
     * частично введенное в название этой ката.
     * Какой смысл говорить «Эврика»? Потому что эта сумма дает такое же число: 89 = 8^1 + 9^2
     *
     * Следующим числом в наличии этого свойства является 135:
     * Посмотрите этот объект еще раз: 135 = 1^1 + 3^2 + 5^2
     *
     * Task!
     * Нам нужна функция для сбора этих чисел, которая может получить два целых числа a, b,
     * определяющий диапазон [a,b] (включительно) и выводит список отсортированных чисел в диапазоне,
     * который соответствует свойству, описанному выше
     *
     *
     */
    public static void main(String[] args) {
        System.out.println(sumDigPow(4,100));
    }
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> out = new ArrayList<>();
        long t = a;
        long temp = 0;
        int count = 0;
        ArrayList<Long> digits = new ArrayList<>();

        if (a<10){
            do {
                out.add(t);
                t++;
            }while (t < 10);
        }
        do {    // разделяем число на цифры
            digits.clear();     // обнуление счетчиков и прочих
            count = 0;
            temp = t;
            do {
                digits.add(temp%10);     // загрузка в массив цифр числа
                temp = temp/10;
            }while (temp != 0);
            temp = 0;
            Collections.reverse(digits);        // разворот чисел 3 2 1 --> 1 2 3
            for(long slct : digits){
                count++;
                temp = temp + (long) Math.pow(slct, count);
            }
            if(temp == t) out.add(temp);
            t++;
        }while (t < b+1);
        return out;
    }
}
