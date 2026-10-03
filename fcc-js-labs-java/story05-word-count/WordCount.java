
public class WordCount{

    static void printCharacters(String str){
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println("chars: " + chars[i]);
        }
    }

    static void getMatchWordCount(String[] sentence, String match){

        int count = 0;

        for(int i = 0; i < sentence.length; i++){

            if(sentence[i].equals(match)){
                count++;
            }

            System.out.println(String.format("Checking '%s' against '%s' | Running count: %d", sentence[i], match, count));
        }
    }

    public static void main(String[] args){

        printCharacters("Hello");

        System.out.println(" ");
        System.out.println("Sentence 1... ");

        getMatchWordCount(new String[] {"I", "really", "really", "really", "like", "to", "code"},"really");

        System.out.println(" ");
        System.out.println("Sentence 2... ");

        getMatchWordCount(new String[] {"Do", "not", "fear", "the", "dandy", "lion"},"dandy");
    
    }
}