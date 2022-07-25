package com.zipcodewilmington.looplabs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;
    Map<T, Integer> counter;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
        counter = new HashMap<>();
    }

    public void populateCountMap() {
        for (T i : array) {
            if (!counter.containsKey(i)) {
                counter.put(i, 1);
                continue;
            }
            counter.put(i, counter.get(i) + 1);
        }
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}
