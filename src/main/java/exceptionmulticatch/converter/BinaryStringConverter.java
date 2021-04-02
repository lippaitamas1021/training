package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        if (binaryString == null)
            throw new NullPointerException("binaryString null");
        boolean[] booleans = new boolean[binaryString.length()];
        for (int j = 0; j < binaryString.length(); j++) {
            char c = binaryString.charAt(j);
            if (c != '0' && c != '1')
                throw new IllegalArgumentException("binaryString not valid");
            booleans[j] = c == '1';
        }
        return booleans;
    }


    public String booleanArrayToBinaryString(boolean[] booleans) {
        StringBuilder stringBuilder = new StringBuilder();
        if (booleans.length == 0) {
            throw new IllegalArgumentException("Parameter is null");
        }
        for (boolean aBoolean : booleans) {
            if (aBoolean) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
        }
        return stringBuilder.toString();
    }
}
