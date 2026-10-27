package ud4.methods;

import java.util.List;

public class FilterVowels {
    public static String filterVowel(String text){
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder result = new StringBuilder();

        for(Character c : text.toCharArray())
            if(!vowels.contains(c)) result.append(c);

        return result.toString();
    }

    public static String filterVowelRegex(String text){
        return text.replaceAll("[aeiouAEIOUáàéèíòóúÀÁÈÉÍÓÒÚ]", "");
    }
}
