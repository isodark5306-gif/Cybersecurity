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
**Result:** Persistent execution on page load

## Lab 2: Stored XSS (HTML Context - No Encoding)

**Type:** Stored XSS
**Payload:**

<script>alert(1)</script>

## Lab3:  DOM XSS (document.write, location.search)

**Type:** DOM XSS
**Payload:**

"><script>alert(1)</script>
