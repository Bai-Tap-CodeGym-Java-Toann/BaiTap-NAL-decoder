public class Main {
    public static void main(String[] args) throws Exception {
        Decoder decoder = new Decoder();
        String[] encodedList = {
                "тҢ⊞ЭЏ҅⌦јϘњҊԠѥРЏҊԟѥПЏԳ⌂ЗХѐҐҦЗФ⊐ҋџўСӐтҳѩ⊃ЏҖ⌐ѫϘѝҊ⋤ѫϘђҊҮЗУїԃҢџϘїԂҭўϦњ҆ѢМВжѕԛџѣҘќбҘҨ⊾ЛЏѸԎѫЗФѤԅҐџљ≧ѣбԳ⋦ѬϘѣ⋼тҵѠ≿ђбҖԫѤϘїѺ⋥ҴЗУїӲ҅ҧЗРӏѿ҉ѫЗМ⊺ѴҊџѭ⊝Џ҇ԂџѥРѤ",
                "ኍቲ቙ቖሷ቙ጲㅅቴኳኜዬቱኩኄヶቶቡቛነቷዐኟዜヸዋቒ቞ሖትቔካኅጊㄶዩቸዅヂሸᇸችャዳዅጧዞፙቲᇬᆵባቾውካፌㅳጉቌቓちሦሢኤዏጨጂᏤጶታላᇚᇟኅኤጏየ፬ㅇኗᇫሿሢ቎ኖዦዃፊᎪዏቐሓቃሹガ዇ኬዢዿደኔሱበガቊቁዛㅺዠንዀ኷ዴቸቛሲኊ፤ዂ኷ቧኝኴኔኈ቏ቾ㄀ክቍኌㄾየኑ኱ጺቐኚハቻሡኤ዆ጃዠዖ",
                "ֲׁ׽֣րՀֵ֧ك֋գՃտէքռ՝՞գֈس֬׀Խ֣տ␋֥֭չօ␂ջՀֳ⏫׉ՉՕ֌ֈجׁ֡Խ֣տֈ֨՞׏׽Օة։␀ֳչր֝⏡֎֧ժչ֑֝ս֏՟ُ׎⏲֞Ը֓␰՞׍ؠ֣տՀְֳ܉⏼֣տՀ֢␥ֺԽ֩⏩֔՟ׁ֡␆֘Ը֖؟՞׌␎Օ֌֒ۯ␝ׇքՕ֌ֈ؟ׁ֬Խ֘⏿ց՟",
                "ডࢹऊऐषुड़ࢉ⟇फࣼࠄࣿ⡮इुऀखझ⚄ࣂধॣ࢒ঙࢻॠ࡯वॶऴ࣑लࣸࢹࢼࣳ०࣮࣋ॅগफ࡞ࣜ⟂क़ࣙࢲৼ➌ࣂ࢖वज❵ࣖড⟂ࣈࣰࣸग✉ीछࢮࣳॳॎछࡹऐ❱डࡕफઍ࣮ࢺअ❙࣮࣍ࣟঃा࢒ऌऐऑ✶ࣿࣳथ࣠পंࢹࢳटછ➇गञࣔࣻ✅ࢗ५মࢼ॔ࣕदࢰ✛ऺऊࣹ࣠॓ज✠ࣣࣹࣾࣔञअॢ✙ࣰࣿठࣀিगࣶࢰआ॔डࣁࢼॄच⛜शऌलীऋँ࣮ࢼ✐এ࣯ࣨ"
        };
        String[] keyList = {"kd#%ZG", "fadia8#FADG", "+_(F#@)", "F{D\"||_ }"};

        for (int i = 0; i < encodedList.length; i++) {
            String encoded = encodedList[i];
            System.out.println("encoded: " + encoded);
            for (int j = 0; j < keyList.length; j++) {
                String key = keyList[j];
                try {
                    String decoded = decoder.decode(encoded, key);
                    System.out.println("key: " + key);
                    System.out.println("decoded: " + decoded);
                    break;
                } catch (Exception e) {
                    if (j == keyList.length - 1) {
                        System.out.println("key: not found");
                    }
                }
            }
            System.out.println("---------------");
        }
    }


}
