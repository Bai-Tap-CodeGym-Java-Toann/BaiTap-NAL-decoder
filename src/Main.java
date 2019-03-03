public class Main {
    public static void main(String[] args) throws Exception {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String encoded = encoder.encode("1234", "223");
        String decoded1 = decoder.DecodeOneTime(encoded, 3);
        String decoded2 = decoder.DecodeOneTime(decoded1, 3);
        System.out.println(encoded);
        System.out.println(decoded1);
        System.out.println(decoded2);
    }


}
