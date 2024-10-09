package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("\nTask 1\n");
        CollectionsTask collectionsTask = new CollectionsTask();
        collectionsTask.runTask(10); // N = 10

        // 2
        System.out.println("\nTask 2\n");
        PrimesGenerator primesGenerator = new PrimesGenerator(10);
        System.out.println("Primes (Reversed): " + primesGenerator.getPrimesReversed());
        for (int prime : primesGenerator) {
            System.out.println("Prime: " + prime);
        }

        // 3
        System.out.println("\nTask 3\n");
        List<Human> humans = Arrays.asList(
                new Human("Sasha", "Tost", 25),
                new Human("Nikita", "Baranich", 30),
                new Human("Vova", "Tipok", 20)
        );

        Set<Human> humanHashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + humanHashSet);

        Set<Human> humanLinkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + humanLinkedHashSet);

        Set<Human> treeSetByLastName = new TreeSet<>(new Human.HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet (by last name): " + treeSetByLastName);

        Set<Human> treeSetByAge = new TreeSet<>(Comparator.comparingInt(Human::getAge));
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet (by age): " + treeSetByAge);

        // 4
        System.out.println("\nTask 4\n");
        String text = "This is a test. This test is simple and this test is good.";
        WordFrequencyCounter.countWordFrequency(text);

        // 5
        System.out.println("\nTask 5\n");
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");

        Map<String, Integer> swappedMap = MapUtils.swapKeysAndValues(originalMap);
        System.out.println("Swapped Map: " + swappedMap);
    }
}
