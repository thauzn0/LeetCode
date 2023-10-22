package leetCode_1455;

public class prefixOfWord {
    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] str = sentence.split(" ");


        for(int i = 0; i< str.length;i++){
            //StringBuilder temp = new StringBuilder(sentence);


            if(str[i].startsWith(searchWord))
            {

                return i+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord(" I love to eat hamburger", "ham"));
    }
}
