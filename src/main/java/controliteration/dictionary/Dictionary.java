package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> englishWords) {
        boolean found = false;
        for (DictionaryItem dictionaryItem : dictionaryItems) {
            if (dictionaryItem.getWord().equals(word)) {
                dictionaryItem.addTranslations(englishWords);
                found = true;
            }
        }
        if (!found) {
            dictionaryItems.add(new DictionaryItem(word, englishWords));
        }
            }

    public List<String> findTranslations(String word) {
        for (DictionaryItem di : dictionaryItems) {
            if (di.getWord().equals(word)) {
                return di.getTranslations();
            }
        }
        return new ArrayList<>();
    }
}

