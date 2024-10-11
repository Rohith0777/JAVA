import java.util.Scanner;

// Base class 'emp' representing an employee
class emp {
    // Static variables for base salary, travel allowance, and dearness allowance
    static int Base_Sal;
    static int TA;
    static int DA;

    // Constructor to initialize base salary, TA, and DA for an employee
    emp(int base_Sal, int TA, int DA) {
        // 'this' keyword used to refer to the current object instance
        this.Base_Sal = base_Sal;
        this.TA = TA;
        this.DA = DA;
    }

    // Method to calculate and display the gross salary of an employee
    void calc_salary() {
        int Gross_Sal = Base_Sal + TA + DA;  // Gross salary is sum of base salary, TA, and DA
        System.out.println("Total salary of the employee is " + Gross_Sal);
    }
}

// Subclass 'empengineer' representing an engineer, which extends the 'emp' class
class empengineer extends emp {
    // Constructor to initialize base salary, TA, and DA for an engineer
    empengineer(int base_Sal, int TA, int DA) {
        super(base_Sal, TA, DA);  // Call the constructor of the base class
    }

    // Overriding the calc_salary method to calculate and display the gross salary for an engineer
    @Override
    void calc_salary() {
        super.calc_salary();  // Call the base class method to calculate the basic gross salary
        System.out.println("Total salary of the engineer is " + 2 * (Base_Sal + TA + DA));  // Engineer's salary is double
    }
}

// Main class 'empmain' to take user input and calculate salary
class empmain {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        int base_Sal, TA, DA;

        // Prompt the user for base salary, TA, and DA values
        System.out.println("Enter the base_Sal: ");
        base_Sal = sc.nextInt();
        System.out.println("Enter the TA: ");
        TA = sc.nextInt();
        System.out.println("Enter the DA: ");
        DA = sc.nextInt();

        // Create an instance of the 'empengineer' class
        empengineer engineer1 =
