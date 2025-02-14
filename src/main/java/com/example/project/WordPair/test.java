package com.example.project.WordPair;


public class test {
    public static void main(String[] args) {
        
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);


        String[] phrase = {new String("the"), "more", new String("the"), "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);

        String[] moreWords = {new String("the"), new String("red"), "fox", new String("the"), new String("red")};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches());
        System.out.println(exampleThree.getAllPairs());

    }
}
