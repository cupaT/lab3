package org.example;
import java.util.*;

public class CollectionsTask {

    // Метод для выполнения всех пунктов задания
    public void runTask(int N) {
        // a) Создаем массив случайных чисел
        Integer[] array = new Random().ints(N, 0, 101).boxed().toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(array));

        // b) На основе массива создаем список List
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("List: " + list);

        // c) Сортируем список по возрастанию
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reversed List: " + list);

        // e) Перемешиваем список
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // f) Выполняем циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("Rotated List: " + list);

        // g) Оставляем только уникальные элементы
        List<Integer> uniqueList = new ArrayList<>(new HashSet<>(list));
        System.out.println("Unique List: " + uniqueList);

        // h) Оставляем только дублирующиеся элементы
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (Integer num : list) {
            if (!duplicates.add(num)) {
                result.add(num);
            }
        }
        System.out.println("Duplicate List: " + new ArrayList<>(result));

        // i) Получаем массив из списка
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("New Array: " + Arrays.toString(newArray));

        // j) Считаем количество вхождений каждого числа
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Map: " + frequencyMap);
    }
}
