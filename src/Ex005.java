import java.util.Scanner; //comando para importar a classe Scaner

public class Ex005 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do pagamento");
        Scanner scanner = new Scanner(System.in);
        int totalCompra = scanner.nextInt();

        if (totalCompra > 100) {
            int soma = totalCompra * 10 / 100;
            int desconto = totalCompra - soma;

            System.out.println("Parabéns você ganhou um desconto.");
            System.out.println("Gastou: " + totalCompra);
            System.out.print("Valor final com desconto: " + desconto );
        } else  {
            System.out.println("Obrigado pela compra! volte sempre :)");
            System.out.print("Gastou: " + totalCompra);
        }
    }
}
