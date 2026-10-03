public class ArrayAccess {
	public static void main(String s[]) {
		// int years[] = {2020,2021,2022,2023,2024,2025};
       
        /*int years[] = new int[6];
        years[1] = 2021;
        years[3] = 2023;*/
        
        /*int years[] = new int[6];
        years[0] = 2020;
        years[1] = 2021;
        years[2] = 2022;
        years[3] = 2023;
        years[4] = 2024;
        years[5] = 2025;

        int count_years = years.length;
        System.out.println("the length of the array is " + count_years);
        for(int i = 0; i < count_years; i++){
            System.out.println(years[i]);
        }*/
        
        
        
		// System.out.println(years[0]);
		// System.out.println(years[1]);
		// System.out.println(years[2]);
		// System.out.println(years[3]);
		// System.out.println(years[4]);
	    // System.out.println(years[5]);
        
        int num_args = s.length;
        System.out.println("the length of the array is " + num_args);
        for (int i = 0; i < num_args; i++){
            System.out.println(s[i]);
        }
        // run args -> java ArrayAccess first second third fourth fifth

    }
}
