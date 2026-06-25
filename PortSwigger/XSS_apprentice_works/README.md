# Cross-Site Scripting (XSS) Security Assessment – PortSwigger Web Security Academy

## Overview

This report summarizes four Cross-Site Scripting (XSS) labs completed on PortSwigger Web Security Academy. The exercises focused on identifying and exploiting Reflected, Stored, and DOM-based XSS vulnerabilities caused by improper handling of user-controlled input.

---

## Lab 1: Reflected XSS

### Vulnerability

Reflected Cross-Site Scripting (XSS)

### Finding

User input was reflected in the application's response without proper sanitization, allowing JavaScript execution within the victim's browser.

### Impact

* Client-side code execution
* Session theft risk
* User impersonation

### Key Takeaway

Applications must validate and encode user input before rendering it in responses.

---

## Lab 2: Stored XSS

### Vulnerability

Stored Cross-Site Scripting (XSS)

### Finding

Malicious input submitted by a user was stored by the application and executed whenever the affected page was viewed.

### Impact

* Persistent client-side code execution
* Multiple users affected
* Potential account compromise

### Key Takeaway

Stored XSS poses a greater risk than reflected XSS due to its persistent nature and wider attack surface.

---

## Lab 3: DOM-Based XSS via document.write()

### Vulnerability

DOM-Based Cross-Site Scripting (XSS)

### Finding

Client-side JavaScript used untrusted URL data within the `document.write()` sink, resulting in code execution within the browser.

### Impact

* Browser-side code execution
* Session and data exposure
* Client-side application compromise

### Key Takeaway

Unsafe DOM sinks such as `document.write()` should not process untrusted user input.

---

## Lab 4: DOM-Based XSS via innerHTML

### Vulnerability

DOM-Based Cross-Site Scripting (XSS)

### Finding

Untrusted input was inserted into the DOM using `innerHTML`, allowing execution of attacker-controlled code through event handlers.

### Impact

* Client-side code execution
* User session compromise
* Malicious content injection

### Key Takeaway

Developers should avoid unsafe DOM manipulation methods and prefer safer alternatives such as `textContent`.

---

## Skills Demonstrated

* Reflected XSS Testing
* Stored XSS Testing
* DOM-Based XSS Analysis
* HTTP Request Manipulation
* Client-Side Security Assessment


## Security Principles Reinforced

* Output Encoding
* Input Validation
* Secure DOM Manipulation
* Defense in Depth

## Conclusion

These exercises provided hands-on experience identifying and analyzing multiple classes of Cross-Site Scripting vulnerabilities. The labs reinforced the importance of secure input handling, output encoding, and safe DOM manipulation practices in modern web applications.

**Evidence:**Additional workflow screenshots for Lab 3 are attached separately for detailed analysis and verification.
