package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Collections Task
        System.out.println("\n--- Task 1: Collections ---\n");
        CollectionsTask collectionsTask = new CollectionsTask();
        collectionsTask.runTask(10); // N = 10

        // 2. Primes Generator
        System.out.println("\n--- Task 2: Primes Generator ---\n");
        PrimesGenerator primesGenerator = new PrimesGenerator(10);
        System.out.println("Primes (Reversed): " + primesGenerator.getPrimesReversed());
        for (int prime : primesGenerator) {
            System.out.println("Prime: " + prime);
        }

        // 3. Human and Sets
        System.out.println("\n--- Task 3: Human and Sets ---\n");
        List<Human> humans = Arrays.asList(
                new Human("John", "Smith", 25),
                new Human("Jane", "Doe", 30),
                new Human("Alex", "Johnson", 20)
        );

        // a) HashSet
        Set<Human> humanHashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + humanHashSet);

        // b) LinkedHashSet
        Set<Human> humanLinkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + humanLinkedHashSet);

        // c) TreeSet с Comparable (по возрасту)
        Set<Human> humanTreeSet = new TreeSet<>(humans);
        System.out.println("TreeSet (by age): " + humanTreeSet);

        // d) TreeSet с компаратором по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new Human.HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet (by last name): " + treeSetByLastName);

        // e) TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(Comparator.comparingInt(Human::getAge));
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet (by age): " + treeSetByAge);

        // 4. Word Frequency
        System.out.println("\n--- Task 4: Word Frequency ---\n");
        String text = "This is a test. This test is simple and this test is good.";
        WordFrequencyCounter.countWordFrequency(text);

        // 5. Swap Keys and Values in Map
        System.out.println("\n--- Task 5: Swap Map Keys and Values ---\n");
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");

        Map<String, Integer> swappedMap = MapUtils.swapKeysAndValues(originalMap);
        System.out.println("Swapped Map: " + swappedMap);
    }
}
