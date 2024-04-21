import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        funcao(in.nextInt());

        in.close();
    }

    public static void funcao(int n) {
        if (n > 0)
            System.out.println('P');
        else
            System.out.println('N');
    }
}
