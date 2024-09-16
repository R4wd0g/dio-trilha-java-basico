import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Criar as variáveis a serem utilizadas
        int conta;
        String agencia, nomeCliente;
        double saldo;

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da conta !");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo que deseja sacar !");
        saldo = scanner.nextDouble();


        //Exibir a mensaem conta criada

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    
        scanner.close();
    
    }


}
