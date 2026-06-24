# PortSwigger XSS Labs – Combined Report

## Objective
This document contains writeups of 4 XSS vulnerabilities solved using PortSwigger Web Security Academy. It demonstrates understanding of Reflected, Stored, and DOM-based XSS.

---

## Lab 1: Reflected XSS (HTML Context - No Encoding)

**Type:** Reflected XSS  
**Payload:**

<script>alert(1)</script>
**Steps:**

* Inject payload into input field
* Submit request
* Observe execution in browser

**Result:**
Alert executed in browser

---
## Lab 2: Stored XSS (HTML Context - No Encoding)

**Type:** Stored XSS
**Payload:**

<script>alert(1)</script>

**Steps:**

* Submit payload in input/comment field
* Refresh page
* Payload executes automatically

**Result:** Persistent execution on page load

---
## Lab3:  DOM XSS (document.write, location.search)

**Type:** DOM XSS
**Payload:**

"><script>alert(1)</script>
**Steps:**

* Inject payload via URL parameter
* Load page
* Observe execution

**Result:** Script executed in browser

---

## Lab 4: DOM XSS (innerHTML, location.search)

**Type:** DOM XSS
**Payload:**

 under angularbrackets: img src=x onerror=alert(1)


**Steps:**

* Inject payload via URL
* Reload page
* Observe execution

**Result:** onerror event triggers alert

---
## Key Learnings
* Reflected vs Stored vs DOM XSS
* Unsafe sinks: innerHTML, document.write
* Browser executes untrusted input when not sanitized

  ---



  ---
## Mitigation
* Output encoding
* Avoid unsafe DOM sinks
* Use textContent instead of HTML injection
---
  ## I have also attached workflow numbering wise for lab3
