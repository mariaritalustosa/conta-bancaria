import java.util.Scanner;
public class ContaBancaria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String cpf;
        Double primeiroDeposito;

        System.out.println("Olá, seja bem-vindo ao JavaBank ^^, informe seus dados para criar sua conta.");
        System.out.println("Informe seu nome completo: ");
        nome = scanner.nextLine();
        
        while (true) {
            System.out.println("Seu CPF: (Sem traços ou pontilhados)");
            cpf = scanner.nextLine();
            if(cpf.matches("\\d{11}")){
                break;
            }   
            System.out.println("CPF inválido! Tem que conter 11 números.");
        }

        System.out.println("Quase lá, para criar a sua conta, precisamos que faça um depósito, pode ser de qualquer valor.");
        primeiroDeposito = scanner.nextDouble();

        System.out.println("Pronto, conta criada!");
        System.out.println("Seus dados: \n"  + "Nome: " + nome + " CPF: " + cpf + " Saldo: R$" + primeiroDeposito);

        scanner.close();
    }
}