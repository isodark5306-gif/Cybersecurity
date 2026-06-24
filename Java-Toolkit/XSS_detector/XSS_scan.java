import java.util.*;

public class XSS_Scan {

    static void checkInput(String input) {

        String lower = input.toLowerCase();

        boolean suspicious = false;
        String findings = "";

        // Script-based injection patterns
        if (lower.contains("<script>")) {
            suspicious = true;
            findings += "<script> ";
        }

        if (lower.contains("</script>")) {
            suspicious = true;
            findings += "</script> ";
        }

        if (lower.contains("<script")) {
            suspicious = true;
            findings += "<script ";
        }

        if (lower.contains("script:")) {
            suspicious = true;
            findings += "script: ";
        }

        if (lower.contains("javascript:")) {
            suspicious = true;
            findings += "javascript: ";
        }

        // Event handler injections
        if (lower.contains("onerror")) {
            suspicious = true;
            findings += "onerror ";
        }

        if (lower.contains("onload")) {
            suspicious = true;
            findings += "onload ";
        }

        if (lower.contains("onclick")) {
            suspicious = true;
            findings += "onclick ";
        }

        if (lower.contains("onmouseover")) {
            suspicious = true;
            findings += "onmouseover ";
        }

        if (lower.contains("onfocus")) {
            suspicious = true;
            findings += "onfocus ";
        }

        if (lower.contains("onmouseenter")) {
            suspicious = true;
            findings += "onmouseenter ";
        }

        if (lower.contains("onkeyup")) {
            suspicious = true;
            findings += "onkeyup ";
        }

        // Common XSS functions
        if (lower.contains("alert(")) {
            suspicious = true;
            findings += "alert( ";
        }

        if (lower.contains("prompt(")) {
            suspicious = true;
            findings += "prompt( ";
        }

        if (lower.contains("confirm(")) {
            suspicious = true;
            findings += "confirm( ";
        }

        if (lower.contains("document.cookie")) {
            suspicious = true;
            findings += "document.cookie ";
        }

        if (lower.contains("document.write")) {
            suspicious = true;
            findings += "document.write ";
        }

        if (lower.contains("window.location")) {
            suspicious = true;
            findings += "window.location ";
        }

        // HTML injection patterns
        if (lower.contains("<iframe")) {
            suspicious = true;
            findings += "<iframe ";
        }

        if (lower.contains("<img")) {
            suspicious = true;
            findings += "<img ";
        }

        if (lower.contains("<svg")) {
            suspicious = true;
            findings += "<svg ";
        }

        if (lower.contains("<body")) {
            suspicious = true;
            findings += "<body ";
        }

        if (lower.contains("<object")) {
            suspicious = true;
            findings += "<object ";
        }

        if (lower.contains("<embed")) {
            suspicious = true;
            findings += "<embed ";
        }

        // Encoding tricks
        if (lower.contains("%3cscript")) {
            suspicious = true;
            findings += "%3cscript ";
        }

        if (lower.contains("&lt;script")) {
            suspicious = true;
            findings += "&lt;script ";
        }

        if (lower.contains("\\u003cscript")) {
            suspicious = true;
            findings += "\\u003cscript ";
        }

        System.out.println("\n=== SECURITY ANALYSIS REPORT ===");

        if (suspicious) {

            System.out.println("Status   : BLOCKED");
            System.out.println("Threat   : Potential XSS / HTML Injection");
            System.out.println("Findings : " + findings);
            System.out.println("Action   : Input Rejected");

        } else {

            System.out.println("Status   : SAFE");
            System.out.println("Threat   : None Detected");
            System.out.println("Findings : No suspicious XSS patterns detected");
            System.out.println("Action   : Input Accepted");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = sc.nextLine();

        checkInput(input);

        sc.close();
    }
}