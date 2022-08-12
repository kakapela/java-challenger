package training_1.if_char_is_in_string;

public class Solution {

    public static boolean charIsInString(String string){

        long count = string.chars()
                .mapToObj(c -> (char) c)
                .filter(character -> Character.toLowerCase(character) == 'n')
                .count();

        return count!= 0;
    }

    public static void main(String[] args) {
        System.out.println( charIsInString("Capgemii"));
    }
}
