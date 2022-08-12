package training_1.reverse_string;

public class Solution {

    public static String solution(String string) {
        return new StringBuffer(string)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Boo"));
    }
}
