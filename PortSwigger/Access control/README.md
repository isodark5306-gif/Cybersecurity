# PortSwigger Access Control Vulnerabilities – Combined Report

**Objective**
This document contains writeups of 3 Access Control (Authorization) labs from PortSwigger Web Security Academy. The focus is on identifying flaws in permission checks that allow unauthorized access to resources or actions.

---

**Lab 1:** Unprotected Admin Functionality

**Vulnerability Type**
- Broken access control
- Missing authorization checks

**Description**
Administrative functionality is exposed without proper access restrictions.

**Exploitation Method**
- Identified admin-only endpoints or functionality
- Accessed them directly without authentication or role verification

**Result**
- Access to restricted administrative features
- Sensitive actions available to unauthorized users

**Impact**
- Full or partial administrative control
- System configuration compromise
- Sensitive operations exposed

**Root Cause**
- No server-side verification for admin privileges
- Hidden endpoints assumed to be secure (security through obscurity)

**Mitigation**
- Enforce server-side authorization checks
- Restrict admin routes using role-based access control (RBAC)
- Never rely on hidden URLs for security

---

# 🧪 Lab 2: User ID Controlled by Request Parameter (IDOR)

**Vulnerability Type**
- Broken access control
- Insecure Direct Object Reference (IDOR)

**Description**
User data is accessed using predictable identifiers (e.g., user ID) without verifying ownership.

**Exploitation Method**
- Modified user ID parameter in request
- Accessed data belonging to another user

**Result**
- Unauthorized access to other users’ information
- Data leakage across accounts

**Impact**
- Privacy violation
- Sensitive data exposure
- Potential account manipulation

**Root Cause**
- Missing ownership validation
- Direct use of user-supplied object identifiers

**Mitigation**
- Enforce object-level access control checks
- Verify user ownership before returning data
- Use indirect references instead of predictable IDs

---

# 🧪 Lab 3: User Role / Privilege Escalation (Horizontal to Vertical)

**Vulnerability Type**
- Broken access control
- Privilege escalation

**Description**
Application allows users to access higher-privilege actions by manipulating role or request parameters.

**Exploitation Method**
- Modified request parameters related to user role or permissions
- Accessed functionality intended for higher-privileged users

**Result**
- Unauthorized access to restricted functionality
- Privilege escalation from normal user to elevated user/admin actions

**Impact**
- Full compromise of application integrity
- Unauthorized administrative actions
- Data manipulation or deletion

**Root Cause**
- Insufficient role validation on server side
- Trusting client-side role indicators

**Mitigation**
- Enforce strict role-based access control (RBAC)
- Validate permissions on every request server-side
- Never trust client-provided role values

---

**Key Learnings**

- Access control failures occur when authorization checks are missing or weak
- IDOR is one of the most common real-world vulnerabilities
- Privilege escalation often results from trusting client-side data
- Hidden endpoints do not provide security

---

**Security Improvements**

- Implement server-side authorization for every request
- Avoid relying on client-side role parameters

---
## I have attached screenshots of the lab works, in a workflow manner by numbering them and writing the lab name for identification purposes


---

