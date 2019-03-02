public class Encoder {

    public String encode(String text, String key) {
        String input = createInput(text, key);
        String shifted, added;
        int repeatTimes = 3;
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
        int inputLength = input.length();

        String[] inputCharacterList = input.split("");
        String[] shiftedCharacterList = new String[inputLength];

        for (int inputIndex = 0; inputIndex < inputLength; inputIndex++) {
            int shiftedIndex = inputIndex + shiftLength;
            while (shiftedIndex >= inputLength) {
                shiftedIndex = shiftedIndex - inputLength;
            }
            shiftedCharacterList[shiftedIndex] = inputCharacterList[inputIndex];
        }
        return String.join("", shiftedCharacterList);
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
