import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        // TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);
        // TODO: Exibir as mensagens para o nosso usuário
        // TODO: Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextFloat();

        // TODO :Exibir a mensagem conta criada
        /*
         * Usando "+":
         * System.out.println("Olá "+nomeCliente+", obrigado por
         * criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e
         * seu saldo R$"+saldo+" já está disponível para saque");
         */

        // usando concat:
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(Integer.toString(numero))
                .concat(" e seu saldo R$").concat(Double.toString(saldo))
                .concat(" já está disponível para saque");

        System.out.println(mensagem);
    }
}
