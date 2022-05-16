package io.github.dbc;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCounter {
    /**
     * Counts the number of duplicate characters in a string.
     *
     * @param string String to count duplicate characters.
     * @return Map with characters and their count.
     */
    public Map<Character, Integer> countDuplicateCharacters(String string) {
        Map<Character, Integer> frequencies = new HashMap<>();
        if (string == null) {
            throw new IllegalArgumentException("string is null");

        }
        for (Character character : string.toCharArray()) {

            if (frequencies.containsKey(character)) {
                frequencies.put(character, frequencies.get(character) + 1);
            } else {
                frequencies.put(character, 1);
            }
        }
        return frequencies;
    }
}
