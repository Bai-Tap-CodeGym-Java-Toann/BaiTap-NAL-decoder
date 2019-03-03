public class Decoder {
    public String decode(String input, String key) throws Exception {
        while (!isFullyDecoded(input, key)) {
            input = decodeOneTime(input, key);
        }
        return input.substring(0, input.length() - key.length());
    }

    private boolean isFullyDecoded(String decoded, String key) throws Exception {
        return decoded.endsWith(key);
    }

    private String decodeOneTime(String input, String key) throws Exception {
        String deAdded, deShifted;
        deAdded = deAdd(input, key);
        deShifted = deShift(deAdded, key);
        return deShifted;
    }

    private String deAdd(String added, String key) throws Exception {
        char[] deAddedChars = new char[added.length()];
        for (int addedIndex = 0; addedIndex < added.length(); addedIndex++) {
            int keyIndex = addedIndex % key.length();
            int addedCharCode = (int) added.charAt(addedIndex);
            int keyCharCode = (int) key.charAt(keyIndex);
            if (keyCharCode >= addedCharCode)
                throw new Exception("key not valid");
            deAddedChars[addedIndex] = (char) (addedCharCode - keyCharCode);
        }
        return String.copyValueOf(deAddedChars);
    }

    private String deShift(String shifted, String key) {
        int shiftLength = key.length() - 1;
        return (shifted.substring(shiftLength) + shifted.substring(0, shiftLength));
    }
}
