package Ass_Class_Objects;

import java.time.LocalTime;

/**
 * Represents and manages attendance records of an employee.
 */
class Attendance {

    private final int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isCheckedIn;
    private boolean isCheckedOut;

    /**
     * Constructor to initialize attendance.
     */
    public Attendance(int empId) {
        this.empId = empId;
        this.isCheckedIn = false;
        this.isCheckedOut = false;
    }

    /**
     * Marks employee check-in time.
     */
    public void markCheckIn() {

        if (isCheckedIn) {
            System.out.println("Check-in failed: Employee already checked in today.");
            return;
        }

        checkInTime = LocalTime.now();
        isCheckedIn = true;

        System.out.println("Check-in successful at: " + checkInTime);
    }

    /**
     * Marks employee check-out time.
     */
    public void markCheckOut() {

        if (!isCheckedIn) {
            System.out.println("Check-out failed: Employee must check in first.");
            return;
        }

        if (isCheckedOut) {
            System.out.println("Check-out failed: Employee already checked out today.");
            return;
        }

        checkOutTime = LocalTime.now();
        isCheckedOut = true;

        System.out.println("Check-out successful at: " + checkOutTime);
    }

    /**
     * Returns formatted attendance details.
     */
    public String getAttendanceDetails() {

        String checkIn = (checkInTime != null) ? checkInTime.toString() : "Not Checked In";
        String checkOut = (checkOutTime != null) ? checkOutTime.toString() : "Not Checked Out";

        return "Employee ID     : " + empId + "\n"
                + "Check-in Time   : " + checkIn + "\n"
                + "Check-out Time  : " + checkOut;
    }
}


/**
 * Represents an employee.
 */
class Employee {

    private final int empId;
    private final String empName;

    /**
     * Constructor to initialize employee details.
     */
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    /**
     * Allows employee to check in.
     */
    public void markCheckIn(Attendance attendance) {
        attendance.markCheckIn();
    }

    /**
     * Allows employee to check out.
     */
    public void markCheckOut(Attendance attendance) {
        attendance.markCheckOut();
    }

    /**
     * Displays employee details.
     */
    public void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}


/**
 * Main class to test the system.
 */
public class ques2 {

    public static void main(String[] args) {

        Employee employee = new Employee(101, "Subhashree");
        Attendance attendance = new Attendance(101);

        employee.displayEmployeeDetails();

        System.out.println("\n--- Attendance Process ---");

        // First check-in
        employee.markCheckIn(attendance);

        // Duplicate check-in (FR-1)
        employee.markCheckIn(attendance);

        // First check-out
        employee.markCheckOut(attendance);

        // Duplicate check-out (FR-3)
        employee.markCheckOut(attendance);

        System.out.println("\n--- Attendance Summary ---");
        System.out.println(attendance.getAttendanceDetails());
    }
}