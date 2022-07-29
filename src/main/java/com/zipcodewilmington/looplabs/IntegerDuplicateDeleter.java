package com.zipcodewilmington.looplabs;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Map<Integer, Integer> counter;
    public IntegerDuplicateDeleter(Integer[] intArr) {
        super(intArr);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        int arrIdx = 0;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                if (count < maxNumberOfDuplications) {
                    for (int j = 0; j < count; j++) {
                        newArr[arrIdx++] = array[i];
                    }
                }
                count = 0;
            }
            count++;
        }
        if (count < maxNumberOfDuplications) {
            for (int i = 0; i < count; i++) {
                newArr[arrIdx++] = array[array.length - 1];
            }
        }
        return Arrays.copyOf(newArr, arrIdx);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        int arrIdx = 0;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                if (count != exactNumberOfDuplications) {
                    for (int j = 0; j < count; j++) {
                        newArr[arrIdx++] = array[i];
                    }
                }
                count = 0;
            }
            count++;
        }
        if (count != exactNumberOfDuplications) {
            for (int i = 0; i < count; i++) {
                newArr[arrIdx++] = array[array.length - 1];
            }
        }
        return Arrays.copyOf(newArr, arrIdx);
    }




}
