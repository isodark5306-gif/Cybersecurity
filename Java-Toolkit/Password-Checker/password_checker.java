import java.util.*;
public class passCheck {
    static void passwordCheck(String password) {

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$_";

        boolean isValid = true;
        String errors = "";

        // Length checks
        if (password.length() < 8) {
            isValid = false;
            errors += "Error: Password too short (minimum 8 characters)\n";
        }

        if (password.length() > 16) {
            isValid = false;
            errors += "Error: Password too long (maximum 16 characters)\n";
        }

        // Character checks
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (specialChars.indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }

        if (!hasUpper) {
            isValid = false;
            errors += "Error: Missing uppercase letter\n";
        }

        if (!hasDigit) {
            isValid = false;
            errors += "Error: Missing digit\n";
        }

        if (!hasSpecial) {
            isValid = false;
            errors += "Error: Missing special character (! @ # $ _)\n";
        }

        if (isValid) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");
            System.out.print(errors);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        passwordCheck(password);

        sc.close();
    }
}