# SQLi Vulnerability Exploitation Labs

---
## 1) SQL Injection – WHERE Clause (Retrieve Hidden Data)

**Objective**
Exploit a SQL injection vulnerability in a product filter/search feature to retrieve hidden database records.

**Vulnerability Type**
- SQL Injection
- WHERE clause manipulation

**Description**
The application directly includes user input in a database query without proper sanitization or parameterization.

**Exploitation Method**
- Injected payload into search/filter input
- Modified query logic to bypass intended filtering

**Result**
- Hidden products/data became visible
- Database response changed based on manipulated input

**Impact**
- Unauthorized data disclosure
- Broken data access control
- Exposure of sensitive backend data

**Root Cause**
- Unsafe string concatenation in SQL query
- No parameterized queries used

**Mitigation**
- Use prepared statements (parameterized queries)
- Validate and sanitize input
- Enforce least privilege database access

---

## 2)SQL Injection – Authentication Bypass (Login Form)

**Objective**
Exploit SQL injection in a login form to bypass authentication without valid credentials.

**Vulnerability Type**
- SQL Injection
- Authentication bypass

**Description**
The login query directly concatenates user input into SQL authentication logic.

**Exploitation Method**
- Entered crafted input in username/password field
- Altered query logic to always evaluate authentication condition as true

**Result**
- Successfully logged in without valid credentials
- Authentication mechanism bypassed

**Impact**
- Account takeover risk
- Unauthorized system access
- Full compromise of authentication system

**Root Cause**
- Improper input handling in authentication query
- Lack of parameterized queries

**Mitigation**
- Use prepared statements for authentication queries
- Implement secure password verification mechanisms
- Apply rate limiting and monitoring

---
  ## I have also attached workflow numbering wise for these labs
