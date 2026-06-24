import java.util.*;

public class Hash {

    static String fakeHash(String password) {

        int hash = 7;

        for (int i = 0; i < password.length(); i++) {
            hash = hash * 31 + password.charAt(i);
        }

        return Integer.toString(hash);
    }

    static boolean validatePassword(String password) {

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$_";

        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else if (specialChars.indexOf(ch) != -1)
                hasSpecial = true;
        }

        return hasUpper && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Registration
        System.out.print("Create Password: ");
        String password = sc.nextLine();

        if (!validatePassword(password)) {
            System.out.println("PASSWORD REJECTED");
            System.out.println("Reason: Password policy violation");
            sc.close();
            return;
        }

        String storedHash = fakeHash(password);

        System.out.println("\nPASSWORD STORED SUCCESSFULLY");
        System.out.println("Stored Hash: " + storedHash);

        // Login
        System.out.print("\nEnter Password to Login: ");
        String loginPassword = sc.nextLine();

        String inputHash = fakeHash(loginPassword);

        System.out.println("\n=== Authentication Process ===");
        System.out.println("Stored Hash    : " + storedHash);
        System.out.println("Generated Hash : " + inputHash);

        if (inputHash.equals(storedHash)) {
            System.out.println("\nLOGIN SUCCESSFUL");
        } else {
            System.out.println("\nLOGIN FAILED");
            System.out.println("Reason: Authentication mismatch (hash comparison)");
        }

        sc.close();
    }
}