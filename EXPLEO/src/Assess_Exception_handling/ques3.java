package Assess_Exception_handling;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// Custom exception for invalid employee number
class InvalidEmpNumberException extends Exception {
    InvalidEmpNumberException(String msg) {
        super(msg);
    }
}

// Custom exception for invalid joining date
class InvalidDateOfJoinException extends Exception {
    InvalidDateOfJoinException(String msg) {
        super(msg);
    }
}

// Employee class
class Employee {

    int empCode;
    String name;
    LocalDate dob;
    LocalDate doj;

    Employee(int empCode, String name, LocalDate dob, LocalDate doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    // Display employee details
    void display() {

        // Calculate experience
        Period exp = Period.between(doj, LocalDate.now());

        System.out.println("Employee Code : " + empCode);
        System.out.println("Employee Name : " + name);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Date of Appointment : " + doj);
        System.out.println("Experience : " + exp.getYears() + " years");
    }
}

public class ques3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Employee Code: ");
            int code = sc.nextInt();
            sc.nextLine();

            // Validate employee code
            if (code <= 0) {
                throw new InvalidEmpNumberException("Employee code must be positive");
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.print("Enter Date of Appointment (yyyy-mm-dd): ");
            LocalDate doj = LocalDate.parse(sc.nextLine());

            // Validate date
            if (!dob.isBefore(doj)) {
                throw new InvalidDateOfJoinException("DOB must be before Date of Appointment");
            }

            // Create employee object
            Employee e = new Employee(code, name, dob, doj);

            // Display details
            e.display();

        } catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}