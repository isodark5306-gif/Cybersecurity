# Access Control Security Assessment – PortSwigger Web Security Academy

## Overview

This report summarizes three Access Control labs completed on PortSwigger Web Security Academy. The objective was to identify and exploit authorization weaknesses that allowed unauthorized access to restricted functionality, sensitive data, or privileged actions.

---

## Lab 1: Unprotected Admin Functionality

### Vulnerability

Broken Access Control

### Finding

Administrative functionality was exposed without proper authorization checks, allowing direct access to privileged features.

### Impact

* Unauthorized access to administrative functions
* Exposure of sensitive application controls
* Potential system-wide compromise

### Key Takeaway

Sensitive functionality must be protected through server-side authorization checks. Hidden URLs should never be considered a security mechanism.

---

## Lab 2: Insecure Direct Object Reference (IDOR)

### Vulnerability

Broken Access Control (IDOR)

### Finding

User-controlled identifiers could be manipulated to access resources belonging to other users.

### Impact

* Unauthorized disclosure of user data
* Privacy violations
* Potential account compromise

### Key Takeaway

Applications must validate resource ownership on every request and enforce object-level authorization controls.

---

## Lab 3: Privilege Escalation

### Vulnerability

Broken Access Control

### Finding

Improper permission validation allowed access to functionality intended for higher-privileged users.

### Impact

* Unauthorized execution of privileged actions
* Administrative functionality exposure
* Risk to application integrity

### Key Takeaway

Permissions should be enforced server-side and never rely on client-controlled values such as roles or access flags.

---

## Skills Demonstrated

* Access Control Testing
* Authorization Analysis
* IDOR Identification
* Privilege Escalation Testing
* HTTP Request Analysis
* Security Impact Evaluation


## Security Principles Reinforced

* Least Privilege
* Server-Side Authorization
* Object-Level Access Control
* Defense in Depth

## Conclusion

These exercises demonstrated how insufficient authorization controls can expose sensitive data and privileged functionality. Through practical exploitation and analysis, I developed hands-on experience identifying Broken Access Control vulnerabilities, one of the most critical categories in modern web application security.

**Evidence:** Numbered screenshots documenting the testing workflow, exploitation process, and successful lab completion are included.
