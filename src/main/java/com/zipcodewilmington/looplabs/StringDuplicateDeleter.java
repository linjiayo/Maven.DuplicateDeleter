package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] strArr) {
        super(strArr);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] newArr = new String[array.length];
        int arrIdx = 0;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArr = new String[array.length];
        int arrIdx = 0;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
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
