package org.example.playing_ground;

import java.util.HashMap;
import java.util.Map;

public class PlayingGround {

    public void findTheMostCommonWord(String paragraph){
        Map<String, Integer> map = new HashMap<>();
        for(String word : paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+")){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        int max = Integer.MIN_VALUE;
        String res = "";
        for(String i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                res = i;
            }
        }
        System.out.printf("the most common word is: %s, and the count is: %s%n", res, max);
    }
}
