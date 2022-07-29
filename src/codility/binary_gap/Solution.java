package codility.binary_gap;

public class Solution {

    /**
     * Method returning "binary gap" of N number
     *
     * @param N positive integer N range 1..2,147,483,647
     * @return binary gap or 0 if does not contain binary gap
     */
    public int solution(int N) {
        if (N > 0 && N < 2_147_483_647) {

            String binary = Integer.toBinaryString(N);
//            System.out.println(binary);

            int result = 0;
            int tmp = 0;

            for (int i = 0; i < binary.length(); i++) {
                char c = binary.charAt(i);
                if (c == '0')
                    tmp++;
                if (c == '1') {
                    if (tmp > result)
                        result = tmp;
                    tmp = 0;
                }
            }
            return result;
        }
        return 0;
    }
}
