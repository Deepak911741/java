public class Count {
    public static void main(String[] args) {
        String sentence = "This is a Sample sentence With several Words.";
        int count = countWordsStartingWithCapital(sentence);
        System.out.println("Number of words starting with capital letters: " + count);
    }

    public static int countWordsStartingWithCapital(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }
        return count;
    }
}
