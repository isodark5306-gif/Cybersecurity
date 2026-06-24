# Labs
# 1)Reflected XSS into HTML Context (No Encoding)

## Objective
Exploit a reflected XSS vulnerability where user input is directly rendered in HTML without sanitization.

## Vulnerability
- Type: Reflected XSS
- Context: HTML body

## Payload Used
```html
<script>alert(1)</script>
