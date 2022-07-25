package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] strArr) {
        super(strArr);
        super.populateCountMap();
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> removed = new ArrayList<>();
        for (String i : array) {
            if (super.counter.get(i) < maxNumberOfDuplications) {
                removed.add(i);
            }
        }
        return removed.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<String> removed = new ArrayList<>();
        for (String i : array) {
            if (super.counter.get(i) != exactNumberOfDuplications) {
                removed.add(i);
            }
        }
        return removed.toArray(new String[0]);
    }


}
