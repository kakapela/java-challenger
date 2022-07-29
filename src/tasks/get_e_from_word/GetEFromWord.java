package tasks.get_e_from_word;

import java.util.stream.Collectors;

public class GetEFromWord {

    public static String extractEFromTheWord(String word){
        return word.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.toLowerCase(c) == 'e')
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String word = "dasfdasfEEEefdasfedsfeE";

        System.out.println(extractEFromTheWord(word));
    }
}
