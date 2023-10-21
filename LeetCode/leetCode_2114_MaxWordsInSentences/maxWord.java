package leetCode_2114_MaxWordsInSentences;

public class maxWord {
    public static int mostWordsFound(String[] sentences) {
        int counter = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            int wordCount = words.length;
            if (wordCount > counter) {
                counter = wordCount;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
