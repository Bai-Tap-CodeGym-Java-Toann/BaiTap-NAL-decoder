public class Decoder {
    public String decode(String input, String key) {


        return null;
    }

    public String DecodeOneTime(String input, int keyLength) {
        String deAdded, deShifted;
        try {
            deAdded = deAdd(input);
        } catch (Exception e) {
            deAdded = input;
        }
        deShifted = deShift(deAdded, keyLength);
        return deShifted;
    }

//    public String getAddedKey(String added) throws Exception {
//        if (added.length() % 2 != 0)
//            throw new Exception("This not an Added String");
//
//        String[] addedChars = added.split("");
//        String[] addedKeyChars = new String[addedChars.length / 2];
//        for (int i = 0; i < addedChars.length; i++) {
//            if (i % 2 != 0) {
//                int addedKeyIndex = (int) Math.ceil((float) (i / 2));
//                addedKeyChars[addedKeyIndex] = addedChars[i];
//            }
//        }
//        return String.join("", addedKeyChars);
//    }

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

    private boolean isFullyDecoded(String decoded, String key) throws Exception {
        String keyPart = decoded.substring(decoded.length() - key.length());
        boolean isKeyPartMatch = keyPart.equals(key);
        boolean isAbleToBeAnAddedString = decoded.length() / 2 == 0;
        boolean isMinimumLengthSatisfied = decoded.length() >= key.length();
        boolean isDecodeAble = isMinimumLengthSatisfied && isAbleToBeAnAddedString;
        if (isKeyPartMatch)
            return true;
        if (!isDecodeAble)
            throw new Exception("my decoder can not cover this case");
        return false;
    }
}
