public class LeaveRequest{
    private int requestId;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status;
    private String reason;

    LeaveRequest(int requestId, Employee employee, String startDate, String endDate, String reason){
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
        this.reason = reason;
    }
}

// Create a default constructor for Employee that sets default values
// Create an overloaded constructor for LeaveRequest that accepts differe