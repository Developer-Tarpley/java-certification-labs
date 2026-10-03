import java.util.Scanner;

public class MyStringOps{

    void main(String s[]){

        String t1 = "Maple Tree";
        String t2 = "Maple Tree";
        System.out.println(t1 == t2);

        String t3 = new String("Maple Tree");
        System.out.println(t3 == t1);
        System.out.println(t3.equals(t1));
        
        String tr1 = t1.substring(0,5);
        String tr2 = t1.substring(6);
        System.out.println(tr1);
        System.out.println(tr2);

        String tr3 = tr1.concat(tr2);
        System.out.println(tr3);

        System.out.println(tr3.toLowerCase());
        System.out.println(tr3.toUpperCase());

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an Index number: ");
        // String input = sc.nextLine();
        // int index = Integer.parseInt(input);
        // System.out.println("You entered index: " + index);
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a substring: ");
        String sub = sc.nextLine();
        int subStart = t1.toLowerCase().indexOf(sub.toLowerCase());
        int subEnd = subStart + sub.length() ;
        System.out.println(subStart);
        System.out.println(subEnd);
        System.out.println("Your substring indices: " + (subStart + " : " + subEnd));
        System.out.println("This is your substring: " + t1.substring(subStart, subEnd));

    }
}