public class Main {
    public static void main(String[] args) throws Exception {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String encoded = encoder.encode("a2c", "223");
        String decoded1 = decoder.DecodeOneTime(encoded, 3);
        String decoded2 = decoder.DecodeOneTime(decoded1, 3);
        String addedKey1 = decoder.getAddedKey(encoded);
        String addedKey2 = decoder.getAddedKey(decoded1);
        System.out.println(encoded);
        System.out.println(decoded1);
        System.out.println(decoded2);
        System.out.println(addedKey1);
        System.out.println(addedKey2);
        System.out.println(decoder.getAddedKey(decoded2));
    }


}
