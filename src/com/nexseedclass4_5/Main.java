package com.nexseedclass4_5;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //method:
        //a method that count number of words in a sentence
        //a method that count number of vowels in a sentence
        Scanner sc = new Scanner(System.in);
        System.out.println("type here ");
        String sentence = sc.nextLine();
        System.out.println("Number of words: "+countWords(sentence));
        System.out.println("Number of vowels: "+countVowels(sentence));
    }
    public static int countWords(String sentence){
        String[] cwords=sentence.split(" ");
        return cwords.length;
    }
    public static int countVowels(String sentence){
        int count=0;
        for (int i=0;i<sentence.length();i++){
            switch (sentence.charAt(i)){
                case 'a', 'i','e','o','u','A','I','E','O','U'->count++;
            }
        }
        return count;
    }
}
