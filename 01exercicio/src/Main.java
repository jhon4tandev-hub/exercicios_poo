import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dígite o nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("Dígite o CPF do titular: ");
        String cpf = sc.nextLine();

        System.out.print("Deseja depositar um valor inicial agora? dígite s");
        String resposta = sc.nextLine();

        ContaBancaria contaBancaria;

        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Dígite o valor para depositar: ");
            double valor = sc.nextDouble();

            contaBancaria = new ContaBancaria(nome, cpf, valor);
        }

        contaBancaria = new ContaBancaria(nome, cpf);

        System.out.println("Mostrando dados do cliente...");

        System.out.println(contaBancaria);

        sc.close();
    }
}