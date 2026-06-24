---
# 1) SQL Injection – WHERE Clause (Retrieve Hidden Data)

## Objective
Exploit a SQL injection vulnerability in a product filter/search feature to retrieve hidden database records.

## Vulnerability Type
- SQL Injection
- WHERE clause manipulation

## Description
The application directly includes user input in a database query without proper sanitization or parameterization.

## Exploitation Method
- Injected payload into search/filter input
- Modified query logic to bypass intended filtering

## Result
- Hidden products/data became visible
- Database response changed based on manipulated input

## Impact
- Unauthorized data disclosure
- Broken data access control
- Exposure of sensitive backend data

## Root Cause
- Unsafe string concatenation in SQL query
- No parameterized queries used

## Mitigation
- Use prepared statements (parameterized queries)
- Validate and sanitize input
- Enforce least privilege database access

---
