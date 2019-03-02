public class Encoder {

    public String encode(String text, String key) {
        String input = createInput(text, key);
        String shifted, added;
        int repeatTimes = 2;
        for (int i = 0; i < repeatTimes; i++) {
            shifted = shift(input, key.length());
            added = add(shifted, key);
            input = added;
        }
        return input;
    }

    private String createInput(String text, String key) {
        return text.concat(key);
    }

    private String shift(String input, int keyLength) {
        int shiftLength = keyLength - 1;
        int shiftPoint = input.length() - shiftLength;
        return (input.substring(shiftPoint) + input.substring(0, shiftPoint));
    }

    private String add(String shifted, String key) {
        int shiftedLength = shifted.length();
        String[] addedCharacterList = new String[shiftedLength];
        String[] shiftedCharacterList = shifted.split("");
        String[] keyCharacterList = key.split("");

        for (int addedIndex = 0; addedIndex < shiftedLength; addedIndex++) {
            int keyIndex = addedIndex;
            while (keyIndex >= key.length()) {
                keyIndex = keyIndex - key.length();
            }
            addedCharacterList[addedIndex] = shiftedCharacterList[addedIndex] + keyCharacterList[keyIndex];
        }
        return String.join("", addedCharacterList);
    }
}
