# OWASP Juice Shop Security Challenges – DOM XSS & Score Board Discovery

## Overview

This report documents two OWASP Juice Shop challenges completed as part of hands-on web application security training. The exercises focused on client-side vulnerability exploitation and security misconfiguration discovery.

---

## Challenge 1: Score Board Discovery

### Category

Security Misconfiguration / Information Disclosure

### Finding

A hidden Score Board page was discovered, exposing the list of available security challenges within the application.

### Impact

* Disclosure of internal application functionality
* Exposure of challenge structure and attack surface
* Information useful for further reconnaissance

### Key Takeaway

Sensitive functionality should not rely solely on obscurity. Hidden endpoints can often be discovered through client-side analysis, directory enumeration, or application exploration.

---

## Challenge 2: DOM-Based Cross-Site Scripting (DOM XSS)

### Category

Cross-Site Scripting (XSS)

### Finding

The application processed user-controlled input within the browser's Document Object Model (DOM) without adequate sanitization, allowing JavaScript execution.

### Impact

* Client-side code execution
* Session compromise risk
* Manipulation of application behavior

### Key Takeaway

Applications should avoid unsafe DOM sinks and properly sanitize untrusted input before inserting it into the page.

---

## Skills Demonstrated

* Web Application Reconnaissance
* Security Misconfiguration Identification
* DOM-Based XSS Testing
* Client-Side Security Analysis
* Vulnerability Validation
* Browser Developer Tools Usage

## Tools

* OWASP Juice Shop
* Browser Developer Tools
* Burp Suite Community Edition

## Security Principles Reinforced

* Secure Configuration
* Input Validation
* Client-Side Security
* Defense in Depth

## Conclusion

These challenges provided practical experience in identifying hidden application functionality and exploiting client-side security weaknesses. They reinforced the importance of secure application design, proper input handling, and minimizing unnecessary information exposure.

**Evidence:** Numbered screenshots documenting the challenge workflow, discovery process, and successful completion of both challenges have been included.

