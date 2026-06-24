import java.util.*;

public class URLCheck {

    static boolean containsURL(String url) {
        String lower = url.toLowerCase();

        return lower.contains("http://") ||
               lower.contains("https://") ||
               lower.contains("www.") ||
               lower.contains(".com") ||
               lower.contains(".org") ||
               lower.contains(".net") ||
               lower.contains(".in");
    }

    static void urlCheck(String url) {

        String lower = url.toLowerCase();

        // NEW RULE: no URL at all
        if (!containsURL(url)) {
            System.out.println("\nURL ANALYSIS REPORT");
            System.out.println("--------------------");
            System.out.println("Status: INVALID URL");
            System.out.println("Reason: No URL detected in input");
            return;
        }

        boolean isSuspicious = false;
        String errors = "";

        // Rule 1: insecure protocol
        if (lower.startsWith("http://")) {
            isSuspicious = true;
            errors += "- Uses HTTP instead of HTTPS\n";
        }

        // Rule 2: sensitive keywords
        if (lower.contains("login") ||
            lower.contains("signin") ||
            lower.contains("sign-in") ||
            lower.contains("verify") ||
            lower.contains("verification") ||
            lower.contains("secure") ||
            lower.contains("update") ||
            lower.contains("account") ||
            lower.contains("password") ||
            lower.contains("bank") ||
            lower.contains("payment") ||
            lower.contains("wallet") ||
            lower.contains("security")) {

            isSuspicious = true;
            errors += "- Sensitive or credential-related keyword detected\n";
        }

        // Rule 3: URL shorteners
        if (lower.contains("bit.ly") ||
            lower.contains("tinyurl") ||
            lower.contains("goo.gl") ||
            lower.contains("t.co") ||
            lower.contains("shorturl") ||
            lower.contains("is.gd")) {

            isSuspicious = true;
            errors += "- URL shortener detected (hidden destination)\n";
        }

        // Rule 4: spoofed domains
        if (lower.contains("paypa1") ||
            lower.contains("g00gle") ||
            lower.contains("faceb00k") ||
            lower.contains("micros0ft") ||
            lower.contains("secure-") ||
            lower.contains("-secure") ||
            lower.contains("verify-") ||
            lower.contains("-verify")) {

            isSuspicious = true;
            errors += "- Possible spoofed or deceptive domain pattern\n";
        }

        // Rule 5: executable files
        if (lower.contains(".exe") ||
            lower.contains(".zip") ||
            lower.contains(".apk") ||
            lower.contains(".scr") ||
            lower.contains(".bat")) {

            isSuspicious = true;
            errors += "- Executable file link detected\n";
        }

        // OUTPUT
        System.out.println("\nURL ANALYSIS REPORT");
        System.out.println("--------------------");

        if (isSuspicious) {
            System.out.println("Status: SUSPICIOUS\n");
            System.out.println("Findings:");
            System.out.print(errors);
        } else {
            System.out.println("Status: SAFE\n");
            System.out.println("No suspicious patterns detected.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter URL:");
        String url = sc.nextLine();

        urlCheck(url);

        sc.close();
    }
}