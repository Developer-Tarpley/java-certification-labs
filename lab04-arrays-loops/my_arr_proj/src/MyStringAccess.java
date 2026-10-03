public class MyStringAccess{
    void main(String s[]){

        // String myString = "This is a new string";
        // myString.toCharArray();
        // int str = myString.length();
        
        String myString = "This is a new string";
        char[] charStr = myString.toCharArray();
        int str = charStr.length;
        
        System.out.println("the lenght of this array is " + str);
        
        for(int i = 0; i < str; i++){
            // System.out.println(myString.charAt(i));
            System.out.println(charStr[i]);
        }
    }
}