
public class SentenceAnalyzer{

    public static int getVowelCount(String sentence){
        int count = 0;
        String vowels = "aeiou" ;
        String[] s = sentence.split("");

        for( String chars: s){
            if(vowels.contains(chars.toLowerCase())) count++;
        }

        return count;
    }

    public static int getConsonantCount(String sentence){
        int count = 0;

        String constants = "bcdfghjklmnpqrstvwxyz";

        String[] s = sentence.split("");

        for (String chars : s){
            if(constants.contains(chars.toLowerCase())) count++;
        }
        return count;
    }

    public static int getPunctuationCount(String sentence){
        int count = 0;
        String punctuations = ".,!?;:-()[]{}\\\"'–";

        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(punctuations.contains(String.valueOf(c))) count++;
        }

        return count;

    };

    public static int getWordCount(String sentence){
        if(sentence.trim() == "") return 0;
        
        String[] s = sentence.split(" ");
        int count  = s.length;

        return count;
    }
    public void main(String[] args){

        System.out.println(getVowelCount("Apples are tasty fruits"));
        System.out.println(getConsonantCount("Apples are tasty fruits"));
        System.out.println(getVowelCount("Coding is fun"));
        System.out.println(getConsonantCount("Coding is fun"));
        System.out.println(getPunctuationCount("WHAT?!?!?!?!?"));
        System.out.println(getWordCount("I love freeCodeCamp"));

    }
}