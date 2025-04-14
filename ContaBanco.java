import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("\nOlá, " + nomeTitular + "!");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Número da Agência: " + numeroAgencia);
        System.out.println("Saldo Atual: R$ " + saldo);
    }
}
