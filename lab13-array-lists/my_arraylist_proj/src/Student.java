import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;
    private String major;

    ArrayList<Student> studentList = new ArrayList<Student>();

    public Student() {
    };

    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getMajor() {
        return this.major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // add student
    public void addStudent(String name, int age, String major) {
        studentList.add(new Student(name, age, major));
    }

    // update student
    public void updateStudent(String update, int idx) {
        studentList.get(idx).major = update;
        System.out.println("Update successful!");
    }

    // delete student
    public void removeStudent(int idx) {
        studentList.remove(idx);
        System.out.println("Student removed successfully!");
    }

    // sort students by age
    public void sortByAge() {

    }

    @Override
    public String toString() {
        return String.format("[name: %s%n age: %d%n major: %s]", name, age, major);
    }

    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            // students list

            // Create a console menu to add, update, delete items in the list and sort the
            // students by age.
            while (true) {
                System.out.println(
                        "Press 1 to add a student, " +
                                "\n2 to view all the students " +
                                "\n3 to change student major " +
                                "\n4 to delete a student " +
                                "\n5 to sort the list based on age " +
                                "\nAny other key to exit");

                String userAction = scanner.nextLine().trim();

                if (userAction.equals("1")) {
                    System.out.println("Enter student name");
                    String studentName = scanner.nextLine();
                    setName(studentName);

                    System.out.println("Enter student age");
                    int studentAge = Integer.parseInt(scanner.nextLine());
                    setAge(studentAge);

                    System.out.println("Enter student major");
                    String studentMajor = scanner.nextLine();
                    setMajor(studentMajor);

                    addStudent(studentName, studentAge, studentMajor);
                } else if (userAction.equals("2")) {
                    studentList.forEach(student -> {
                        System.out.println(student);
                    });
                } else if (userAction.equals("3")) {
                    System.out.println("Search for student");
                    String findStudent = scanner.nextLine();
                    setName(findStudent);
                    boolean found = false;
                    int idx = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).name.equalsIgnoreCase(findStudent)) {
                            found = true;
                            idx = i;
                            break;
                        }
                        System.out.println("Match not Found.");
                    }

                    if (found) {
                        System.out.println("Update Major");
                        String newMajor = scanner.nextLine();
                        if (newMajor.equalsIgnoreCase(this.major)) {
                            System.out.println("Major already up to date");
                        } else {
                            setMajor(newMajor);
                            updateStudent(newMajor, idx);
                        }
                    }

                } else if (userAction.equals("4")) {
                    System.out.println("Search for student");
                    String findStudent = scanner.nextLine();
                    int idx = -1;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).name.equalsIgnoreCase(findStudent)) {
                            idx = i;
                            break;
                        }
                    }
                    if (idx == -1) {
                        throw new StudentNotFoundException("No mathches to this reference.");
                    }
                    System.out.println("Remove: " + studentList.get(idx).name);
                    System.out.println("Press Y to confirm or N to exit");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Y")) {
                        removeStudent(idx);
                    }
                    continue;

                } else if (userAction.equals("5")) {
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override 
                        public int compare(Student s1, Student s2){
                            return Integer.compare(s2.getAge(), s1.getAge());
                        }
                    });
                    System.out.println("Students sorted by age (high to low");
                    studentList.forEach(student ->{
                        System.out.println(student);
                    });
                } else {
                    break;
                }
            }
            // sc.close();

        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (StudentNotFoundException snfe) {
            System.out.println(snfe.getMessage());
        }
    }
}