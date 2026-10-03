public class StringOps{

    void main(String s[]){

        String s1 = "Hello World";
        // creates a string literal
        // goes to String constant pool
        // reuses memory allocation if the same string occurs
        System.out.println(s1);
        String s2 = new String("Hello World");
        // creates a string object
        // this is a new object
        // goes to heap memory
        System.out.println(s2);

        String s3 = "Hello World";

        System.out.println("s1 and s2 comparison " + (s1 == s2));
        System.out.println("s2 and s3 comparison " + (s2 == s3));
        System.out.println("s1 and s3 comparison " + (s1 == s3));
    
        String s4 = "The quick brown fox jumped over the lazy dog";
        
        System.out.println(s4.length());
        char[] strAsArray = s4.toCharArray();
        System.out.println(strAsArray.length);

        System.out.println(strAsArray);

        System.out.println("the first char of the string is " + strAsArray[0]);
        System.out.println("the last char of the string is " + strAsArray[strAsArray.length - 1]);
        System.out.println("the index of T is " + s4.indexOf('T'));
        System.out.println("the index of g is " + s4.indexOf('g'));


        String s5 = "Washington";
        String s6 = new String("Washington");
        String s7 = "WASHINGTON";

        System.out.println("Equality check s5 and s6 - " + s5.equals(s6));
        System.out.println("Equality check s5 and s7 - " + s5.equals(s7));
        System.out.println("Equality check s5 and s7 - " + s5.equalsIgnoreCase(s7));

        System.out.println("s5 in lowercase - " + s5.toLowerCase());
        System.out.println("s7 in lowercase - " + s7.toLowerCase());
        
        System.out.println("s5 and s7 lowercase equality check - " + s5.toLowerCase().equals(s7.toLowerCase()));
        
        System.out.println("s5 in uppercase - " + s5.toUpperCase());
        System.out.println("s7 in uppercase - " + s7.toUpperCase());
    
        String s8 = "50F1A";
        System.out.println("s8 in lowercase - " + s8.toLowerCase());

        String regexStr = "^W.*";
        System.out.println("s5 matches regex ^W.* - " + s5.matches(regexStr));
        System.out.println("s7 matches regex ^W.* - " + s7.matches(regexStr));

        String s9 = "     WASHINGTON          ";
		System.out.println("Equality check s7 and s9 - "+ s7.equals(s9));
		s9 = s9.strip();
		System.out.println("Equality check after stripping s7 and s9 - "+s7.equals(s9));
    
        String str1 = "Washington";
        String str2 = " DC";

        str1 = str1.concat(str2); // creates new string object
        System.out.println("str1 " + str1);
        
        str1 = str1.substring(0, 10);
        // creates new string object
        System.out.println("str1 " + str1);

        System.out.println("str1.substring(7,10) " + str1.substring(7,10));
        System.out.println("str1.substring(7) " + str1.substring(7));



    }
}