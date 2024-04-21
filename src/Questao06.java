import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int horas = 0, minutos = 0;
        do {
            System.out.println("\nInforme as horas no formato 24h (Digite um valor negativo em qualquer campo para interromper): ");
            horas = in.nextInt();
            System.out.println("Informe as minutos: ");
            minutos = in.nextInt();
            if (horas > 23 || minutos > 59) {
                System.out.println("Horário inválido!");
            }
            else {
                char formato = conversaoFormato(horas);
                horas = conversaoHora(horas);
                impressao(horas, minutos, formato);
            }

        } while (horas > 0 || minutos > 0);


        in.close();
    }

    public static int  conversaoHora(int horas) {
        if (horas > 12)
            horas -= 12;
        if (horas == 0)
            horas = 12;
        return horas;
    }

    public static char conversaoFormato(int horas) {
        char formato = 'A';
        if (horas > 12)
            formato = 'P';
        return formato;
    }

    public static void impressao(int horas, int minutos, char formato) {
        System.out.printf("Horas no formato 12h: %d:%d %c.M" , horas, minutos, formato);

    }
}
