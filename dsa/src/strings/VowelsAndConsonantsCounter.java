package strings;

public class VowelsAndConsonantsCounter {

    public static String countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantsCount = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check only alphabets
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        return "Vowels Count : " + vowelCount + "  Consonants Count : " + consonantsCount;
    }

    public static void main(String[] args) {
        String input = "Hello World";

        String result = countVowelsConsonants(input);
        System.out.println(result);
    }
}
