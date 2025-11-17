public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isSmoker;
    private double height; // in inches
    private double weight; // in pounds
    private static int totalPolicyHolders = 0; // Count of PolicyHolder instances

    // Constructor
    public PolicyHolder(String firstName, String lastName, int age, boolean isSmoker, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isSmoker = isSmoker;
        this.height = height;
        this.weight = weight;
        totalPolicyHolders++;
    }

    // Getter for smoking status
    public boolean isSmoker() {
        return isSmoker;
    }

    // Get total PolicyHolder count
    public static int getTotalPolicyHolders() {
        return totalPolicyHolders;
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Policyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status (Y/N): %s\nPolicyholder's Height: %.2f inches\nPolicyholder's Weight: %.2f pounds\n",
                firstName, lastName, age, (isSmoker ? "smoker" : "non-smoker"), height, weight);
    }
}