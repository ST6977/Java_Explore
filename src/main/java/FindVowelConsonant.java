public class FindVowelConsonant {

    public static void main(String[]args){
        String line = "I am a SQA Engineer";
        line = line.toLowerCase();
        int vowels = 0, consonants = 0,  spaces = 0;


        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }

            // check if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }


            else if (ch == ' ') {
                ++spaces;
            }

        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Words: " +  (spaces+1));


        System.out.println("Num of characters : " +  (vowels + consonants ));
    }
}
