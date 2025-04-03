//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result;  // declaration



        // Types of Operators in Java
        // 1. Arithmetic Operators

        // Operator + : Addition
        result = a + b; // Expression using + operator
        // System.out.println("Addition: " + result);
        // Operator - : Subtraction
        result = a - b;
        // System.out.println("Subtraction: " + result);
        // Operator * : Multiplication
        result = a * b;
        // System.out.println("Multiplication: " + result);

        // Operator / : Division
        result = a / b;
       // System.out.println("Division: " + result);
        // Operator % : Modulus (Remainder)
        result = a % b; // Result of 'a % b' is always '0'
       // System.out.println("Modulus: " + result);

        // 2. Assignment Operators

        // = :
        a = b ; // Assign b to a
       // System.out.println(" Assign b to a " + " b is "+b+ " a is "+a );

        // += :
        a += b; // a = a + b
       // System.out.println(" a += b , now a is "+a);

        // -=, *=, /=, %=
        a -= b;
       // System.out.println(" a -= b , now a is "+a);
        a *= b;
       // System.out.println(" a *= b , now a is "+a);
        a /= b;
      //  System.out.println(" a /= b , now a is "+a);
        a %= b;
      //  System.out.println(" a %= b , now a is "+a);


        // 3 . Unary Operators
        int x =10;
        boolean flag = true;

        System.out.println("Original x: " + x);
        // ++: increase the operand by 1
        System.out.println("x++; return the value of x, x: " + x++); // return the value of x then increment x
        System.out.println("then increment x, x: "+ x);

        System.out.println("++x; increment x , then return the value of x, x: " + ++x);

        // --:
        System.out.println("x--; return the value of x, x: " + x--); // return the value of x then increment x
        System.out.println("then decrement  x, x: "+ x);

        System.out.println("--x; decrement  x , then return the value of x, x: " + --x);

        // !: Not
        System.out.println("Original flag: " + flag);
        System.out.println("Negation of flag (!flag): " + (!flag));

        // 4 .Relational (Comparison) Operators
        //  These operators compare values and return a boolean (true or false).

        System.out.println(" a is "+a + " , and b is "+ b);
        System.out.println("a == b: " +(a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a <= b: " + (a <= b)); // true


        // 5 . Logical Operators

        //  && :  Logical AND
        System.out.println("a > 5 && b < 10 :" +(a > 5 && b < 10)); // false && true : false
        //  || : Logical OR
        System.out.println("a > 5 || b < 10 :" +(a > 5 || b < 10)); // false || true : true
        // ! : NOT
        System.out.println("Negation of flag (!flag): " + (!flag));

        // Control Flow Statements

        int num = 0;
        if(num > 0){
            System.out.println("Number is positive");
        }else if(num < 0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }

        // Functions & Methods
        Greeting gtr = new Greeting();
        // how to invoke : call a method
        String str =  gtr.greeting("World");
        System.out.println(str);










    }

    private static String getString() {
        return "apply  x*x";
    }
}
