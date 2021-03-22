package controlselection.consonant;

import java.util.Arrays;
import java.util.List;

public class ToConsonant {

    private List<Character> abc = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public char convertToConsonant(char searchedCharacter) {
        if (!abc.contains(searchedCharacter)) {
            throw new IllegalArgumentException("Unknown letter");
        }
        char d = 0;
        for (int i = 0; i < abc.size(); i++) {
            if (abc.get(i) == searchedCharacter) {
                if (isVowel(searchedCharacter)) {
                    d = abc.get(i + 1);
                } else {
                    return searchedCharacter;
                }
            }
        }
        return d;
    }

    private boolean isVowel(Character character) {
        return (vowels.contains(character));
    }

    public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.abc.size());
        System.out.println(toConsonant.abc.get(5));
        System.out.println(toConsonant.convertToConsonant('e'));
    }
}
