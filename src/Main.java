public class Main {
    public static void main(String[] args) throws Exception {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String encoded = encoder.encode("1234", "223");
        System.out.println(encoded);
        System.out.println(encoded.length());
        String decoded = decoder.decode(encoded,"223");
        System.out.println(decoded);
    }


}
