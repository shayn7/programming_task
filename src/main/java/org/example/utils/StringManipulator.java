package org.example.utils;


import lombok.Getter;
import org.example.enums.SortingOrder;
import org.example.enums.SplitBy;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

@Getter
public class StringManipulator {

    private SortedSet<String> treeSet;

    public String sort(SortingOrder sortingOrder, SplitBy splitBy, String paragraph){
        switch (sortingOrder){
            case ASCENDING -> treeSet = new TreeSet<>();
            case DESCENDING -> treeSet = new TreeSet<>(Collections.reverseOrder());
        }
        initSet(treeSet, splitWords(splitBy, convertToLowerCase(paragraph)));
        return treeSet.toString();
    }

    private String[] splitWords(SplitBy splitBy, String paragraph){
        return switch (splitBy){
            case WHITE_SPACE -> paragraph.split("\\s+");
            case COMA -> paragraph.split(",");
            case NEW_LINE -> paragraph.split("\\R");
        };
    }

    private void initSet(SortedSet<String> treeSet, String[] words){
        Collections.addAll(treeSet, words);
    }

    private String convertToLowerCase(String file){
        return file.toLowerCase();
    }
}
