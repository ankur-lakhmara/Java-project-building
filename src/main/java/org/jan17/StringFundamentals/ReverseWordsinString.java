package org.jan17.StringFundamentals;

public class ReverseWordsinString {
    static void main(String[] args) {
        String s = "i love java";
        StringBuilder str = new StringBuilder();
        str = new StringBuilder(s);
        str.reverse();
        StringBuilder newStr = new StringBuilder();
        int i = 0;
        while(i<str.length()){
            //handle spaces
            if(str.charAt(i)==' '){
                newStr.append(' ');
                i++;
            }
            //handling word
            int start = i;
            while(i<str.length() && str.charAt(i) != ' '){
                i++;
            }
            String word = str.substring(start,i);
            newStr.append(new StringBuilder(word).reverse());
        }
        System.out.println("new str"+newStr.toString());
    }
}


//Reverse Words in a String
//
//Input: "i love java"
//
//Output: "java love i"
