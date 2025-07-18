import java.util.Scanner;

class Problem1 {
    double a, b;
    String operation;

    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result = " + (a + b));
                break;
            case "subtract":
                System.out.println("Result = " + (a - b));
                break;
            case "multiply":
                System.out.println("Result = " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine(); // clear buffer
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine();

        Problem1 calc = new Problem1(a, b, op);
        calc.calculate();
    }
}
