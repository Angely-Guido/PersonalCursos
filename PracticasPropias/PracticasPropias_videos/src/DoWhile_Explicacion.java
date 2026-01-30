import java.util.Scanner;

public class DoWhile_Explicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do{
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
        }
        while(num < 0);
        System.out.println("Entra");

    }
}
