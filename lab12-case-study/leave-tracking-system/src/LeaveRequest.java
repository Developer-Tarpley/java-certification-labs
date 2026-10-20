import java.util.ArrayList;

// Interfaces
public interface Approvable{
    boolean approve(String approverName);
    boolean deny(String approverName, String reason);
}

// Main Class
public class LeaveRequest {
    private int requestId;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status;
    private String reason;

    private ArrayList<StatusChange> statusHistory = new ArrayList<>();

    LeaveRequest(int requestId, Employee employee, String startDate, String endDate, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
        this.reason = reason;
    }

    public boolean processRequest(){
        System.out.println("Processing generic leave request...");
        return true;
    }

    // Inner Class
    public class StatusChange{
        private String oldStatus;
        private String newStatus;
        private String changeDate;
        private String changedBy;

        StatusChange(String oldStatus, String newStatus, String changeDate, String changedBy){
            this.oldStatus = oldStatus;
            this.newStatus = newStatus;
            this.changeDate = changeDate;
            this.changedBy = changedBy;
        }

        public String getOldStatus(){
            return oldStatus;
        }

        public String getNewStatus(){
            return newStatus;
        }

        public String getChangeDate(){
            return changeDate;
        }

        public String getChangedBy(){
            return changedBy;
        }

        public void changeStatus(String newStatus, String changedBy){
            String oldStatus = this.status;
            this.status = newStatus;

            StatusChange change = new StatusChange(oldStatus, newStatus, getCurrentDate(), changedBy);
            statusHistory.add(change);
        }


    }

    

}

public abstract class LeaveRequest implements Approvable{
    private boolean approve(String approverName);
    private boolean deny(String approverName, String reason);

    // abstarct method for subclasses
    public abstract int calculateLeaveDays();
}

// Sub-Calssses
public class SickLeaveRequest extends LeaveRequest {
    private boolean medicalCertificationProvied;

    SickLeaveRequest(int requestId, Employee employee, String startDate, String endDate,
            boolean medicalCertificationProvied) {
        super(requestId, employee, startDate, endDate, "Sick Leave");
        this.medicalCertificationProvied = medicalCertificationProvied;
    }

    public boolean isMedicalCertificationProvided() {
        return medicalCertificationProvied;
    }

    @Override 
    public boolean processRequest(){
        if(!medicalCertificationProvied && getDuration() > 2){
            System.out.println("Sick leave longer than 2 days requires a medical certificate");
            return false;
        }
        System.out.println("Processing sick leave request...");
        return true;
    }

}

public class VacationLeaveRequest extends LeaveRequest {
    private boolean medicalCertificationProvied;

    VacationLeaveRequest(int requestId, Employee employee, String startDate, String endDate,
            boolean medicalCertificationProvied) {
        super(requestId, employee, startDate, endDate, "Vacation Leave");
        this.medicalCertificationProvied = medicalCertificationProvied;
    }

    public boolean isMedicalCertificationProvided() {
        return medicalCertificationProvied;
    }
}

public class MaturnityLeaveRequest extends LeaveRequest {
    private boolean medicalCertificationProvied;

    MaturnityLeaveRequest(int requestId, Employee employee, String startDate, String endDate,
            boolean medicalCertificationProvied) {
        super(requestId, employee, startDate, endDate, "Maturnity Leave");
        this.medicalCertificationProvied = medicalCertificationProvied;
    }

    public boolean isMedicalCertificationProvided() {
        return medicalCertificationProvied;
    }
}

// Create a default constructor for Employee that sets default values
// Create an overloaded constructor for LeaveRequest that accepts different parameters
// Use constructors to create new Employee and LeaveRequest objects


// Create a hierarchy of leave types (SickLeaveRequest, VacationLeaveRequest, MaternityLeaveRequest)
// Add specific attributes and methods to each leave type
// Use the parent class constructor in child classes using super()
// Override the processRequest() method in each leave type subclass
// Create an array or list of different leave request types
// Process all requests using polymorphism
// Create an Approvable interface with approval methods
// Make LeaveRequest an abstract class that implements Approvable
// Implement the abstract methods in concrete leave type classes
// Create an inner class for status changes in the LeaveRequest class
// Use the inner class to track the history of status changes
// Display the full status history of a leave request