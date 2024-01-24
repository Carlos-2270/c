import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Digite Agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite Nùmero da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o valor do Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
         ", conta " + numero + " e seu saldo " + saldo + " já está diponível.");
        

    }
}
