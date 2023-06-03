package Moses.week3;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String input = "AAABBCDD";
        Map<Character,Integer> frequencyMap = getCharacterFrequency(input);

        for(Map.Entry<Character , Integer> entry : frequencyMap.entrySet())

            System.out.println(entry.getKey() + "" + entry.getValue());


    }

    private static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < input.length();i++){
            char ch = input.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+ 1);
        }
        return frequencyMap;
    }


}
