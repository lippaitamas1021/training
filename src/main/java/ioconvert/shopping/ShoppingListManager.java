package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    private List<String> shoppingList = new ArrayList<>();

    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os))) {
            for (String s : shoppingList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not write in the file", e);
        }
    }

    public List<String> loadShoppingList(InputStream is) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                shoppingList.add(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        return shoppingList;
    }
}