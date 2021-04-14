package exam02;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] integers) {
        StringBuilder stringBuilder = new StringBuilder();
        if (integers.length == 0) {
            return "";
        }
        stringBuilder.append("[");
        List<Integer> arrayList = new ArrayList<>();
        for (int x : integers) {
            arrayList.add(x);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(arrayList.get(i));
                stringBuilder.append(", ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
