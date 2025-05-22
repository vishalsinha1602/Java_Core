package Java_Oops.polymorphism;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));         // Output: 5
        System.out.println(calc.add(2.5, 3.5));     // Output: 6.0
        System.out.println(calc.add(1, 2, 3));      // Output: 6
    }
}

