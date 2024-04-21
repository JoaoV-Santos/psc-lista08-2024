import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int a = in.nextInt();
        System.out.println("Informe o segundo número:");
        int b = in.nextInt();
        System.out.println("Informe o terceiro número:");
        int c = in.nextInt();

        soma(a, b, c);

        in.close();
    }
    public static void soma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
