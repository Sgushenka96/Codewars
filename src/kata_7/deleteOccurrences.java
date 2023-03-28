package kata_7;

import java.util.ArrayList;

public class deleteOccurrences {
    /**
     * Enough is enough!
     * Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
     * He tells them that he will only sit for the session if they show the same motif at most N times. Luckily, Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
     *
     * Task
     * Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
     * For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
     * With list [20,37,20,21] and number 1, the result would be [20,37,21].
     */

    /**
     * Хватит!
     * Алиса и Боб были в отпуске. Оба они сделали много фотографий мест, где они были,
     * и теперь они хотят показать Чарли всю свою коллекцию. Однако Чарли не нравятся эти сеансы,
     * так как мотив обычно повторяется. Он не любит видеть Эйфелеву башню 40 раз.
     *
     * Он говорит им, что будет сидеть на сеансе только в том случае,
     * если они покажут один и тот же мотив максимум. N раз.
     * К счастью, Алиса и Боб могут закодировать мотив как число.
     * Можете ли вы помочь им удалить номера таким образом,
     * чтобы их список содержал каждый номер только до N раз, не меняя порядка?
     *
     * Task
     * Задав список и номер, создайте новый список, содержащий каждое число list самое большее N раз, без переупорядочивания.
     * Например, если входной номер равен 2, и входной список [1,2,3,1,2,1,2,3],
     * Вы берете [1,2,3,1,2], отбросьте следующий [1,2] поскольку это привело бы к 1 и 2 being in the result 3 times,
     * and then take 3, что приводит к [1,2,3,1,2,3].
     * Со списком [20,37,20,21] и номер 1, Результат будет следующим: [20,37,21].
     */
    public static void main(String[] args) {
        deleteNth(new int[]{1,2,3,0,0,1,0,1,4}, 1);
        }



    public static int[] deleteNth(int[] elements, int maxOccurrences) {     // массив чисел, и максимальное кол-во повторений.
        int[][] check = new int[elements.length][2];
        ArrayList<Integer> out = new ArrayList<>();

        for(int i = 0; i < check.length; i++){      // Основной пробор от 0 до N индекса
            check[i][0] = elements[i];
            for (int j = 0; j < check.length; j++ ){

                if (j > i) break;       // Если i нет смысла проверять дальше, то перекидываемся на следующий пробор
                if (check[i][0] == check[j][0]){        // Если равны, то
                    check[j][1] = check[i][1]++;        // Добавляем какой по счету повтор
                }

            }
            if (check[i][1] < maxOccurrences){
                out.add(check[i][0]);       // Добавление в итоговый список, если он не превысил доп. кол-во повторений
            }


        }
        return out.stream().mapToInt(i->i).toArray();
    }
}
