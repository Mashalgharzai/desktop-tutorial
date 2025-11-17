public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private double policyPrice;
    private static int totalPolicies = 0; // Static field to track Policy instances

    // Constructor
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder, double policyPrice) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        this.policyPrice = policyPrice;
        totalPolicies++;
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Policy Number: %d\nProvider Name: %s\n%sPolicy Price: $%.2f\n", 
                policyNumber, providerName, policyHolder.toString(), policyPrice);
    }

    // Get total number of policies
    public static int getTotalPolicies() {
        return totalPolicies;
    }

    // Getter for policyHolder
    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }
}