package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class CollectionsTaskTest {

    @Test
    public void testArrayNotEmpty() {
        CollectionsTask task = new CollectionsTask();
        Integer[] array = new Random().ints(10, 0, 101).boxed().toArray(Integer[]::new);
        assertTrue(array.length > 0, "Array should not be empty");
    }

    @Test
    public void testListSortedAscending() {
        CollectionsTask task = new CollectionsTask();
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 3, 7, 2, 9));
        Collections.sort(list);
        assertEquals(Arrays.asList(2, 3, 7, 9, 10), list, "List should be sorted in ascending order");
    }
}

class PrimesGeneratorTest {

    @Test
    public void testGeneratePrimes() {
        PrimesGenerator generator = new PrimesGenerator(5);
        List<Integer> primes = Arrays.asList(11, 7, 5, 3, 2);
        assertEquals(primes, generator.getPrimesReversed(), "Should generate the first 5 prime numbers");
    }

    @Test
    public void testReversePrimes() {
        PrimesGenerator generator = new PrimesGenerator(3);
        List<Integer> primesReversed = Arrays.asList(5, 3, 2);
        assertEquals(primesReversed, generator.getPrimesReversed(), "Prime numbers should be reversed");
    }
}

class HumanTest {

    @Test
    public void testHumanSortingByAge() {
        List<Human> humans = Arrays.asList(
                new Human("John", "Smith", 25),
                new Human("Jane", "Doe", 30),
                new Human("Alex", "Johnson", 20)
        );
        Collections.sort(humans);
        assertEquals(20, humans.get(0).getAge(), "Youngest person should be sorted first");
    }

    @Test
    public void testHumanSortingByLastName() {
        List<Human> humans = Arrays.asList(
                new Human("John", "Smith", 25),
                new Human("Jane", "Doe", 30),
                new Human("Alex", "Johnson", 20)
        );
        humans.sort(new Human.HumanComparatorByLastName());
        assertEquals("Doe", humans.get(0).getLastName(), "Doe should come first by last name");
    }
}

class WordFrequencyCounterTest {

    @Test
    public void testWordFrequency() {
        String text = "This is a test. This test is simple.";
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        assertEquals(2, wordCount.get("this"), "Word 'this' should appear twice");
    }

    @Test
    public void testWordFrequencySingleWord() {
        String text = "test";
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        assertEquals(1, wordCount.get("test"), "Word 'test' should appear once");
    }
}

class MapUtilsTest {

    @Test
    public void testSwapKeysAndValues() {
        Map<Integer, String> original = new HashMap<>();
        original.put(1, "One");
        original.put(2, "Two");
        Map<String, Integer> swapped = MapUtils.swapKeysAndValues(original);
        assertEquals(1, swapped.get("One"), "Key 'One' should map to 1");
    }

    @Test
    public void testSwapKeysAndValuesEmptyMap() {
        Map<Integer, String> original = new HashMap<>();
        Map<String, Integer> swapped = MapUtils.swapKeysAndValues(original);
        assertTrue(swapped.isEmpty(), "Swapped map should be empty for an empty original map");
    }
}

