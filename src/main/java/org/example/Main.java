package org.example;


import org.example.enums.SortingOrder;
import org.example.enums.SplitBy;
import org.example.playing_ground.PlayingGround;
import org.example.utils.StringManipulator;
import org.example.utils.FileReader;
import org.example.utils.FileWriter;

import java.io.IOException;

import static org.example.enums.SortingOrder.ASCENDING;
import static org.example.enums.SortingOrder.DESCENDING;

public class Main {

    private static final String ORIGINAL_FILE = "src/main/resources/F1.txt";
    private static final String MANIPULATED_FILE = "src/main/resources/F2.txt";

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();
        StringManipulator stringManipulator = new StringManipulator();
        PlayingGround playingGround = new PlayingGround();
        playingGround.findTheMostCommonWord(fileReader.readFile(ORIGINAL_FILE));
        fileWriter.writeToFile(MANIPULATED_FILE, stringManipulator.sort(ASCENDING, SplitBy.WHITE_SPACE, fileReader.readFile(ORIGINAL_FILE)));
    }

}