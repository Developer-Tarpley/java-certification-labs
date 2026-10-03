import java.util.ArrayList;
import java.util.Scanner;

public class BasicTaskList {

    private ArrayList<Task> taskList;

    public BasicTaskList() {
        this.taskList = new ArrayList<>();
    };

    class Task {
        private String userinput;

        public Task(String task) {
            this.userinput = task;
        }

        public String getUserInput() {
            return userinput;
        }

        @Override
        public String toString() {
            return userinput;
        }

    };

    public String addTask(String task) {
        this.taskList.add(new Task(task));
        return "Your task: '" + task + "' has been added succesfully.";
    }

    public void printTasks(){
        System.out.println("\nCurrent Tasks: ");
        System.out.println("\n************\n");
        for(int i = 0; i < taskList.size(); i++){
            System.out.println(taskList.get(i));
        }
        System.out.println("\n************\n");
    }

    @Override
    public String toString() {
        return taskList.toString();
    }

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicTaskList tasks = new BasicTaskList();

        while (true) {
            System.out.println("\nWelcome to the task maker! \n");
            System.out.println("1. Add Task");
            System.out.println("2. List All Tasks");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                while (true) {
                    System.out.println("\nEnter a Task | or type exit to leave this option: ");
                    String text = sc.nextLine();

                    if("done".equalsIgnoreCase(text)) break;

                    System.out.println(tasks.addTask(text));

                }
            }
            else if (choice.equals("2")) {
                if(tasks.taskList.size() < 1 )
                System.out.println("\nNo Tasks are Recorded");
                else
                tasks.printTasks();
            }
            else if (choice.equals("3")) {
                System.out.println("Exiting...");
                if(tasks.taskList.size() > 0){
                    System.out.println(tasks.taskList.size() + " Tasks Recorded");
                    System.out.println(tasks);
                }else{
                    System.out.println("No Tasks are Recorded");
                }
                break;
            }
            else{
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
