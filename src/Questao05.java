import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor do custo do produto:");
        double c = in.nextDouble();
        System.out.println("Informe a porcentagem de imposto incidente sobre o produto:");
        double i = in.nextDouble();

        somaImposto(i, c);

        in.close();
    }
    public static void somaImposto(double taxaImposto, double custo) {
        custo = custo * (1 + (taxaImposto / 100));
        System.out.printf("O valor do produto com o imposto é R$ %.2f" , custo);
    }
}
