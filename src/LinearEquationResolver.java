import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x + b = 0', please enter containts :");
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();
        if (a == 0){
            if(b == 0){
                System.out.println("phuong trinh gi ma tham so toan bang 0!");
            }
            else{
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else{
            if(b == 0){
                System.out.println("phuong trinh co nghiem la x = "+0);
            }else{
                System.out.println("phuong trinh co nghiem la s = "+(-b/a));
            }
        }

    }
}
