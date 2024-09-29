import java.util.HashMap;

public class FrequencyInString {

    public static void main(String[] args) {
        String myStr = "I live in Dhaka";
        char[] chars = myStr.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap();
        for (char c : chars) {
            if (c != ' ') {
                // Convert to lower case for case insensitive counting
                 c = Character.toLowerCase(c);
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }

        }
        System.out.println(hashMap);
    }
}

