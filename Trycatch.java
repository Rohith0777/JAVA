import java.util.Scanner;

class AgeVerify {
    void vote(int age) {
        try {
            if (age < 18) {
                throw new IllegalAccessException("You must be at least 18 years old to vote.");
            } else {
                System.out.println("You can vote!");
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION OCCURRED: " + e);
        } finally {
            System.out.println("Finally, age verification done.");
        }
    }
}

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter age of Voter:");
        age = sc.nextInt();
        AgeVerify av = new AgeVerify();
        av.vote(age);
        System.out.println("Verification completed successfully");
        sc.close();
    }
}

