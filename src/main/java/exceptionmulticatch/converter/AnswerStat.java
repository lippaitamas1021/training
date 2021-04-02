package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.converter = binaryStringConverter;
    }

    public int answerTruePercent(String answers) {
        boolean[] booleans = convert(answers);
        int numberOfTrue = 0;
        for (boolean aBoolean : booleans) {
            if (aBoolean) {
                numberOfTrue++;
            }
        }
        return (int)Math.round((double)numberOfTrue / booleans.length * 100);
    }

    public boolean[] convert(String checkboxes) {
        try {
            return converter.binaryStringToBooleanArray(checkboxes);
        } catch (NullPointerException | IllegalArgumentException ex) {
            InvalidBinaryStringException.error(ex.getMessage(), ex);
            throw new InvalidBinaryStringException(ex);
        }
    }
}
