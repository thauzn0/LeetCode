package leetCode_1528_shuffleString;

public class leetCode_1528_shuffleString {


    public static String restoreString(String s, int[] indices) {
        //You are given a string s and an integer array indices of the same length.
        if(s.length() != indices.length){
            return "";
        }

        StringBuilder sb=new StringBuilder("");
        char temp[]=new char[s.length()];

        for(int i=0;i<s.length();i++){
            int idx = indices[i];
            temp[idx] =s.charAt(i);

        }
        sb.append(temp);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] indices  ={4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", indices));
    }
}
