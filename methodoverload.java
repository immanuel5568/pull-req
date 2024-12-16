class methodoverload {
    public static void main(String args[]) {
        // Predefined value for factorial calculation
        int n = 5; // Example: Change this to any number for a different factorial
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
