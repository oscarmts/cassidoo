
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Natoify {

    public static void printf(String sentence) {
        final Map<String, String> nameNames = getNatoNames();
        final List<String> sentenceChars = Arrays.asList(sentence.split(""));
        StringBuffer stringBuffer = new StringBuffer();
        sentenceChars.forEach(letter -> stringBuffer.append(nameNames.get(letter.toUpperCase())).append(" "));
        System.out.println(stringBuffer.toString().trim());
    }

    private static Map<String, String> getNatoNames() {
        Map<String, String> natoNames = new HashMap<>();
        natoNames.put("A", "Alfa");
        natoNames.put("B", "Bravo");
        natoNames.put("C", "Charlie");
        natoNames.put("D", "Delta");
        natoNames.put("E", "Echo");
        natoNames.put("F", "Foxtrot");
        natoNames.put("G", "Golf");
        natoNames.put("H", "Hotel");
        natoNames.put("I", "India");
        natoNames.put("J", "Juliett");
        natoNames.put("K", "Kilo");
        natoNames.put("L", "Lima");
        natoNames.put("M", "Mike");
        natoNames.put("N", "November");
        natoNames.put("O", "Oscar");
        natoNames.put("P", "Papa");
        natoNames.put("Q", "Quebec");
        natoNames.put("R", "Romeo");
        natoNames.put("S", "Sierra");
        natoNames.put("T", "Tango");
        natoNames.put("U", "Uniform");
        natoNames.put("V", "Victor");
        natoNames.put("W", "Whiskey");
        natoNames.put("X", "Xray");
        natoNames.put("Y", "Yankee");
        natoNames.put("Z", "Zulu");
        natoNames.put("0", "Zero");
        natoNames.put("1", "One");
        natoNames.put("2", "Two");
        natoNames.put("3", "Three");
        natoNames.put("4", "Four");
        natoNames.put("5", "Five");
        natoNames.put("6", "Six");
        natoNames.put("7", "Seven");
        natoNames.put("8", "Eight");
        natoNames.put("9", "Nine");
        natoNames.put(" ", "(space)");
        return natoNames;
    }
}
