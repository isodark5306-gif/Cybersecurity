## XSS Detector
---
## Objective

To identify potentially malicious user inputs that may contain Cross-Site Scripting (XSS) payloads and demonstrate basic XSS detection techniques.

---
## Approach

The program accepts user input and scans it for commonly used XSS keywords and attack patterns such as:

<script>
alert(
document.cookie
onerror
onclick

If any suspicious pattern is detected, the input is flagged as a potential XSS attempt.
---

## Inference

This project demonstrates how attackers can inject malicious scripts into web applications through user-controlled input. It highlights the importance of validating and sanitizing user input before processing or displaying it.

## Limitations
  
Detects only predefined XSS patterns.
Cannot identify heavily obfuscated payloads.
Cannot detect context-specific XSS vulnerabilities.
Does not perform real-time browser or DOM analysis.
Intended for educational purposes and basic demonstration only.
