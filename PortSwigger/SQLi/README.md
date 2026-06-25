# SQL Injection Security Assessment – PortSwigger Web Security Academy

## Overview

This report summarizes two SQL Injection (SQLi) labs completed on PortSwigger Web Security Academy. The exercises focused on identifying vulnerabilities caused by unsafe handling of user input within database queries.

---

## Lab 1: SQL Injection in a WHERE Clause

### Vulnerability

SQL Injection

### Finding

User-controlled input was incorporated directly into a database query, allowing modification of the query logic and access to unintended records.

### Impact

* Unauthorized data disclosure
* Exposure of hidden application content
* Bypass of intended data restrictions

### Key Takeaway

User input should never be directly included in SQL statements. Parameterized queries are essential to prevent query manipulation.

---

## Lab 2: Authentication Bypass via SQL Injection

### Vulnerability

SQL Injection

### Finding

Improper handling of login credentials allowed manipulation of the authentication query, resulting in successful login without valid credentials.

### Impact

* Authentication bypass
* Unauthorized account access
* Potential compromise of application security

### Key Takeaway

Authentication logic must use parameterized queries and secure credential validation mechanisms to prevent unauthorized access.

---

## Skills Demonstrated

* SQL Injection Testing
* Authentication Security Analysis
* HTTP Request Manipulation
* Vulnerability Validation
* Security Impact Assessment
* Burp Suite Usage



## Security Principles Reinforced

* Input Validation
* Secure Authentication Design
* Parameterized Queries
* Least Privilege

## Conclusion

These labs demonstrated how improper handling of user input can compromise both data confidentiality and authentication mechanisms. Through practical exploitation and analysis, I gained hands-on experience identifying and assessing SQL Injection vulnerabilities, one of the most critical risks in web application security.

**Evidence:** Numbered screenshots documenting the testing process and successful exploitation are included.
