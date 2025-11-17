import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Policy[] policies = new Policy[6]; // Array to hold policies

        // Loop to gather information for 6 PolicyHolder and Policy pairs
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for PolicyHolder " + (i + 1) + ":");
            
            System.out.print("Policyholder's First Name: ");
            String firstName = scanner.nextLine();
            
            System.out.print("Policyholder's Last Name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Policyholder's Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Policyholder's Smoking Status (Y/N): ");
            boolean isSmoker = scanner.nextLine().equalsIgnoreCase("Y");
            
            System.out.print("Policyholder's Height (inches): ");
            double height = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Policyholder's Weight (pounds): ");
            double weight = Double.parseDouble(scanner.nextLine());

            PolicyHolder holder = new PolicyHolder(firstName, lastName, age, isSmoker, height, weight);

            System.out.print(" Policy Number: ");
            int policyNumber = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Provider Name: ");
            String providerName = scanner.nextLine();
            
            System.out.print("Enter Policy Price: ");
            double policyPrice = Double.parseDouble(scanner.nextLine());

            policies[i] = new Policy(policyNumber, providerName, holder, policyPrice);
            System.out.println(); // Add an empty line for better readability
        }

        // Output all policies
        System.out.println("\n--- Policy Details ---");
        for (Policy policy : policies) {
            System.out.println(policy);
        }

        // Count smokers and non-smokers
        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies) {
            if (policy.getPolicyHolder().isSmoker()) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("There were " + Policy.getTotalPolicies() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        scanner.close(); // Close the scanner to avoid memory leaks
    }
}