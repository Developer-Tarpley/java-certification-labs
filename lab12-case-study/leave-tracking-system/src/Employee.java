public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private String email;

    private int leaveBalance;

    Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        if (leaveBalance >= 0) {
            this.leaveBalance = leaveBalance;
        } else {
            Sytem.out.println("Leave balance cannot be negative.");
        }
    }
}

// }Create an Employee class with appropriate attributes
// Create a LeaveRequest class with start date, end date, and status attributes
// Create instances (objects) of these classes to represent different employees
// and their leave requests
// Add getters and setters for all attributes in Employee and LeaveRequest classes
// Add validation in setters (to enable rejection of negative leave balances)
// Create a method to calculate remaining leave balance after a request