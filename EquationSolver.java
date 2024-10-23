import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solve first-degree equation
        System.out.println("1. Solve first-degree equation (ax + b = 0)");
        System.out.print("Enter a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter b : ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("The solution is: x = " + x);
        } 
	else {
            if (b == 0) {
                System.out.println("infinitely many solutions.");
            } 
		else {
                System.out.println("no solutions.");
            }
        }

        // 2
        // a1*x + b1*y = c1
        // a2*x + b2*y = c2
        System.out.println("\n2. Solve system of first-degree equations:");
        System.out.print("Enter a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter c1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Enter c2: ");
        double c2 = scanner.nextDouble();

        double determinant = a1 * b2 - a2 * b1;

        if (determinant != 0) {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("The solution is: x = " + x + ", y = " + y);
        } else {
            if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                System.out.println("infinitely many solutions.");
            } else {
                System.out.println("no solution.");
            }
        }

        // 3
        System.out.println("\n3. Solve second-degree equation (ax^2 + bx + c = 0)");
        System.out.print("Enter a: ");
        double a2nd = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b2nd = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c2nd = scanner.nextDouble();

        if (a2nd == 0) {
            System.out.println("This is not a second-degree equation.");
        } else {
            double discriminant = b2nd * b2nd - 4 * a2nd * c2nd;

            if (discriminant > 0) {
                double root1 = (-b2nd + Math.sqrt(discriminant)) / (2 * a2nd);
                double root2 = (-b2nd - Math.sqrt(discriminant)) / (2 * a2nd);
                System.out.println("The equation has two real roots: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b2nd / (2 * a2nd);
                System.out.println("The equation has one real root: x = " + root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }

       
        scanner.close();
    }
}
