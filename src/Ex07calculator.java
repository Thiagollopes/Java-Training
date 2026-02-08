import java.util.Scanner;

public class Ex07calculator {
    public static void main(String[] args) {

        if (validation()) {
            System.out.print("\n");
            calculator();
        }
    }

    static boolean validation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha");
        int passwd = scanner.nextInt();

        while (passwd != 1234) {
            System.out.println("Digite novamente sua senha");
            int newPasswd = scanner.nextInt();
            passwd = newPasswd;
        }
        System.out.println("Acesso permitido");
        return true;
    }

    static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number1 = scanner.nextInt();

        System.out.println("Digite outro numero");
        int number2 = scanner.nextInt();

        int soma = number1 + number2;
        System.out.println("A soma dos números é: " + soma);

    }
}
