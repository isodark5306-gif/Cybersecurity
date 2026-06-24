import java.util.*;

public class Phishing {

    static void phishingCheck(String message) {

        boolean isPhishing = false;
        String errors = "";

        String lower = message.toLowerCase();

        // Rule 1: urgency keywords
        if (lower.contains("urgent") ||
            lower.contains("immediately") ||
            lower.contains("act now") ||
            lower.contains("within 24 hours") ||
            lower.contains("final notice") ||
            lower.contains("last warning") ||
            lower.contains("asap")) {

            isPhishing = true;
            errors += "Suspicious: Urgency-based language detected\n";
        }

        // Rule 2: account / security threat keywords
        if (lower.contains("suspended") ||
            lower.contains("blocked") ||
            lower.contains("disabled") ||
            lower.contains("verify") ||
            lower.contains("verification required") ||
            lower.contains("unauthorized login") ||
            lower.contains("security alert") ||
            lower.contains("account locked")) {

            isPhishing = true;
            errors += "Suspicious: Account/security threat detected\n";
        }

        // Rule 3: action / credential stealing prompts
        if (lower.contains("click here") ||
            lower.contains("login now") ||
            lower.contains("password") ||
            lower.contains("update your account") ||
            lower.contains("confirm identity") ||
            lower.contains("re-enter") ||
            lower.contains("submit details") ||
            lower.contains("download attachment")) {

            isPhishing = true;
            errors += "Suspicious: Credential/action request detected\n";
        }

        // Output format
        if (isPhishing) {
            System.out.println("PHISHING MESSAGE");
            System.out.print(errors);
        } else {
            System.out.println("SAFE MESSAGE");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message:");
        String message = sc.nextLine();

        phishingCheck(message);

        sc.close();
    }
}