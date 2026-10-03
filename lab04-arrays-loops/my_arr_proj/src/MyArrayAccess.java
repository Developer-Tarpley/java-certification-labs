public class MyArrayAccess{
    void main(String s[]){

        int grades[] = new int[10];
        grades[0] = 89;
        grades[1] = 79;
        grades[2] = 88;
        grades[3] = 64;
        grades[4] = 100;
        grades[5] = 77;
        grades[6] = 83;
        grades[7] = 94;
        grades[8] = 98;
        grades[9] = 86;

        int num_grades = grades.length;
        System.out.println("the lenght of this array is " + num_grades);

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);
        System.out.println(grades[5]);
        System.out.println(grades[6]);
        System.out.println(grades[7]);
        System.out.println(grades[8]);
        System.out.println(grades[9]);

        System.out.println("\n*** For Looped ****");
        for(int i = 0; i < num_grades; i++){
            System.out.println(grades[i]);
        }
    }
}