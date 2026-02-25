
/*
==================== REGEX QUICK REVISION ====================

1️⃣ START & END
^        → Start of string
$        → End of string

Example:
^[a-z]+$   → Only small letters (full string)


---------------------------------------------------------------

2️⃣ ALLOWED CHARACTERS  [ ]

[a-z]      → Small letters
[A-Z]      → Capital letters
[0-9]      → Digits
[a-zA-Z]   → All letters
[a-zA-Z0-9] → Letters + numbers
[a-zA-Z ]  → Letters + space


---------------------------------------------------------------

3️⃣ COUNT  { }

{3}        → Exactly 3 times
{3,5}      → Between 3 and 5 times
{3,}       → 3 or more times

Example:
[0-9]{10}  → Exactly 10 digits


---------------------------------------------------------------

4️⃣ REPETITION SYMBOLS

+   → 1 or more times
*   → 0 or more times
?   → Optional (0 or 1 time)

Examples:
[a-z]+     → At least 1 letter
[a-z]*     → 0 or more letters
colou?r    → color / colour


---------------------------------------------------------------

5️⃣ GROUP & OR

( )        → Group
|          → OR

Example:
(HR|IT|SALES)   → Only HR or IT or SALES


---------------------------------------------------------------

6️⃣ COMMONLY USED PATTERNS

✔ Username (min 5)
^[a-z0-9]{5,}$

✔ Mobile (10 digits)
^[0-9]{10}$

✔ Employee ID (EMP123)
^EMP[0-9]{3}$

✔ Roll Number (CS101)
^[A-Z]{2}[0-9]{3}$

✔ Name (min 3 letters + space)
^[a-zA-Z ]{3,}$

✔ Strong Password (8+, 1 upper, 1 lower, 1 digit)
^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$


---------------------------------------------------------------

MEMORY TRICK:

^  → Start
$  → End
[] → Allowed characters
{} → Count
+  → 1 or more
*  → 0 or more
?  → Optional
() → Group
|  → OR

===============================================================  */





// ==================== REGEX QUICK REVISION (JAVA) ====================
package CommonImp;

public class MatchesCommon {
    public static void main(String[] args) {

        // 1️⃣ START (^) and END ($)
        System.out.println("abc".matches("^[a-z]+$"));
        // true → only small letters (full string)

        // 2️⃣ ALLOWED CHARACTERS []
        System.out.println("Amit".matches("[a-zA-Z]+"));
        // true → letters only

        System.out.println("abc123".matches("[a-zA-Z0-9]+"));
        // true → letters + numbers

        // 3️⃣ COUNT {}
        System.out.println("1234".matches("[0-9]{4}"));
        // true → exactly 4 digits

        System.out.println("9876543210".matches("[0-9]{10}"));
        // true → exactly 10 digits (mobile)

        System.out.println("hello".matches("[a-z]{3,}"));
        // true → minimum 3 letters

        // 4️⃣ ONE OR MORE (+)
        System.out.println("abc".matches("[a-z]+"));
        // true → 1 or more letters

        // 5️⃣ ZERO OR MORE (*)
        System.out.println("".matches("[a-z]*"));
        // true → empty allowed

        // 6️⃣ OPTIONAL (?)
        System.out.println("color".matches("colou?r"));
        System.out.println("colour".matches("colou?r"));
        // both true

        // 7️⃣ GROUP ()
        System.out.println("abcabc".matches("(abc)+"));
        // true → abc repeated

        // 8️⃣ OR (|)
        System.out.println("HR".matches("HR|IT|SALES"));
        // true

        // 9️⃣ COMMON REAL PATTERNS

        // Username (min 5 small letters + numbers)
        System.out.println("user1".matches("^[a-z0-9]{5,}$"));

        // Employee ID
        System.out.println("EMP101".matches("^EMP[0-9]{3}$"));

        // Roll Number
        System.out.println("CS101".matches("^[A-Z]{2}[0-9]{3}$"));

        // Name (letters + space, min 3)
        System.out.println("Raj Patel".matches("^[a-zA-Z ]{3,}$"));

        // Strong Password
        System.out.println("Strong123"
                .matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$"));

    }
}
