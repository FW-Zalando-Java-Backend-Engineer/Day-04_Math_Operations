# **📘 Day-04: Java Math Operations, Operators & Expressions**  
Welcome to **Day-04** of our Java learning journey! Today, we will explore **mathematical operations, operators, and expressions** in Java. These concepts will help us manipulate data, perform calculations, and control program logic efficiently.

---

## **📌 Lesson Structure**
### **1️⃣ Introduction to Mathematical Operations in Java**
- What are **Mathematical Operators**?
- Understanding **Operators and Operands**.

### **2️⃣ Arithmetic Operators**
- **Basic Arithmetic Operators** (`+`, `-`, `*`, `/`, `%`).
- **Shortcut Arithmetic Assignment Operators** (`+=`, `-=`, `*=`, `/=`, `%=`).

### **3️⃣ Unary Operators**
- **Increment (`++`) & Decrement (`--`) Operators**.
- **Unary Minus (`-`)** and **Logical NOT (`!`)** Operator.

### **4️⃣ Relational (Comparison) Operators**
- **Equal to (`==`), Not equal to (`!=`)**.
- **Greater than (`>`), Less than (`<`)**.
- **Greater than or equal to (`>=`), Less than or equal to (`<=`)**.

### **5️⃣ Logical Operators**
- **AND (`&&`), OR (`||`), NOT (`!`)**.
- **Short-circuit Logical Operators**.

### **6️⃣ Expressions in Java**
- **Understanding Java Expressions**.
- **Types of Expressions**: Infix, Postfix, Prefix.

---

## **📜 Live Coding Examples**
### **🖥️ Arithmetic Operations in Java**
```java
public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 15, b = 5;
        
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }
}
```
**📝 Expected Output:**
```
Addition: 20
Subtraction: 10
Multiplication: 75
Division: 3
Modulo: 0
```

---

### **🖥️ Unary Operators: Increment & Decrement**
```java
public class UnaryOperators {
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("Original: " + num);
        System.out.println("Post-increment: " + (num++));
        System.out.println("After Post-increment: " + num);
        System.out.println("Pre-increment: " + (++num));
        System.out.println("Post-decrement: " + (num--));
        System.out.println("After Post-decrement: " + num);
        System.out.println("Pre-decrement: " + (--num));
    }
}
```
**📝 Expected Output:**
```
Original: 10
Post-increment: 10
After Post-increment: 11
Pre-increment: 12
Post-decrement: 12
After Post-decrement: 11
Pre-decrement: 10
```

---

### **🖥️ Relational Operators Example**
```java
public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20;
        
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }
}
```
**📝 Expected Output:**
```
x == y: false
x != y: true
x > y: false
x < y: true
x >= y: false
x <= y: true
```

---

### **🖥️ Logical Operators Example**
```java
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("!a: " + (!a));         // false
        System.out.println("!b: " + (!b));         // true
    }
}
```
**📝 Expected Output:**
```
a && b: false
a || b: true
!a: false
!b: true
```

---

### **🖥️ Java Expressions (Infix, Postfix, Prefix)**
```java
public class JavaExpressions {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Infix Expression
        System.out.println("Infix Expression (a + b): " + (a + b));

        // Postfix Expression
        System.out.println("Postfix a++: " + (a++));
        System.out.println("After Postfix: " + a);

        // Prefix Expression
        System.out.println("Prefix ++a: " + (++a));
    }
}
```
**📝 Expected Output:**
```
Infix Expression (a + b): 15
Postfix a++: 10
After Postfix: 11
Prefix ++a: 12
```

---

## **🎯 Hands-on Exercises**
✅ **Modify the Arithmetic Operations program** to include **exponentiation (`Math.pow()`)**.  
✅ **Write a Java program** that checks if a number is **even or odd** using the modulus operator (`%`).  
✅ **Implement a logical operation** that checks if a number is between 10 and 50 using `&&`.  
✅ **Create a method** that calculates the **factorial** of a given number using a loop.  

---

## **📚 Additional Resources**
- **[Java Operators Guide (Oracle Docs)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)**
- **[Java Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)**
- **[Java Math Operations](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)**
- **[Logical & Relational Operators (GeeksForGeeks)](https://www.geeksforgeeks.org/operators-in-java/)**
- [Video Lesson Recording](_will be added later_)
- [Lesson Slides: Math Operations](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-04_Math_Operations/blob/main/Math%20Operations.pdf)

---


🚀 **Great job! Keep practicing and get ready for Day-05!** 🎉
