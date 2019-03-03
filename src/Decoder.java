public class Decoder {
    public String decode(String input, String key) throws Exception {
        while (!isFullyDecoded(input, key)) {
            input = decodeOneTime(input, key.length());
        }
        return input.substring(0, input.length() - key.length());
    }

    /*
    * This method is very low-accuracy as is not tested and
    * can easily by pass :(
    */
    private boolean isFullyDecoded(String decoded, String key) throws Exception {
        String keyPart = decoded.substring(decoded.length() - key.length());
        boolean isKeyPartMatch = keyPart.equals(key);
        boolean isAbleToBeAnAddedString = decoded.length() % 2 == 0;
        boolean isMinimumLengthSatisfied = decoded.length() >= key.length();
        boolean isDecodeAble = isMinimumLengthSatisfied && isAbleToBeAnAddedString;
        if (isKeyPartMatch)
            return true;
        if (!isDecodeAble)
            throw new Exception("my decoder can not cover this case");
        return false;
    }

    private String decodeOneTime(String input, int keyLength) {
        String deAdded, deShifted;
        try {
            deAdded = deAdd(input);
        } catch (Exception e) {
            deAdded = input;
        }
        deShifted = deShift(deAdded, keyLength);
        return deShifted;
    }

    private String deAdd(String added) throws Exception {
        if (added.length() % 2 != 0)
            throw new Exception("This not an Added String");

        String[] addedChars = added.split("");
        String[] deAddedChars = new String[addedChars.length / 2];
        for (int i = 0; i < addedChars.length; i++) {
            if (i % 2 == 0) {
                deAddedChars[i / 2] = addedChars[i];
            }
        }
        return String.join("", deAddedChars);
    }

    private String deShift(String shifted, int keyLength) {
        int shiftLength = keyLength - 1;
        return (shifted.substring(shiftLength) + shifted.substring(0, shiftLength));
    }
}
