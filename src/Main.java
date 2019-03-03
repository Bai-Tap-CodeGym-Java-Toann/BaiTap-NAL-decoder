public class Main {
    public static void main(String[] args) throws Exception {
        Decoder decoder = new Decoder();
        String encoded = "тҢ⊞ЭЏ҅⌦јϘњҊԠѥРЏҊԟѥПЏԳ⌂ЗХѐҐҦЗФ⊐ҋџўСӐтҳѩ⊃ЏҖ⌐ѫϘѝҊ⋤ѫϘђҊҮЗУїԃҢџϘїԂҭўϦњ҆ѢМВжѕԛџѣҘќбҘҨ⊾ЛЏѸԎѫЗФѤԅҐџљ≧ѣбԳ⋦ѬϘѣ⋼тҵѠ≿ђбҖԫѤϘїѺ⋥ҴЗУїӲ҅ҧЗРӏѿ҉ѫЗМ⊺ѴҊџѭ⊝Џ҇ԂџѥРѤ";
        String key = "kd#%ZG";
        System.out.println(decoder.decode(encoded, key));

        //throws exception
        //String notValidKey = "fadia8#FADG";
        //System.out.println(decoder.decode(encoded, notValidKey));

    }


}
