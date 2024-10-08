package org.example;

import java.util.*;

public class MapUtils {

    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> originalMap) {
        Map<V, K> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        return swappedMap;
    }
}
