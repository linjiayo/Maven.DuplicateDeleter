package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Map<Integer, Integer> counter;
    public IntegerDuplicateDeleter(Integer[] intArr) {
        super(intArr);
        populateCountMap();
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        List<Integer> removed = new ArrayList<>();
        for (Integer i : array) {
            if (super.counter.get(i) < maxNumberOfDuplications) {
                removed.add(i);
            }
        }
        return removed.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<Integer> removed = new ArrayList<>();
        for (Integer i : array) {
            if (super.counter.get(i) != exactNumberOfDuplications) {
                removed.add(i);
            }
        }
        return removed.toArray(new Integer[0]);
    }




}
