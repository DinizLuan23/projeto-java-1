import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente = "Luan Diniz";
        String tipoConta = "Corrente";
        double saldoConta = 5000;

        int opcaoMenu = 0;

        System.out.println("""
        ***********************************
        Dados iniciais do cliente:
        
        Nome: %s
        Tipo conta: %s
        Saldo inicial: R$ %.2f
        ***********************************
        """.formatted(nomeCliente, tipoConta, saldoConta));

        while(opcaoMenu != 4){
            System.out.println("""
            Operações
            
            1- Consultar saldos
            2- Receber Valor
            3- Transferir valor
            4- Sair
            
            Digita a opção desejada:
            
            """);

            opcaoMenu = leitura.nextInt();

            if(opcaoMenu == 1){
                System.out.println("Valor em conta é: R$ " + saldoConta);
            } else if (opcaoMenu == 2) {
                System.out.println("Digite o valor recebido:");
                double valorRecebido = leitura.nextDouble();

                saldoConta += valorRecebido;
                System.out.println("Novo saldo: " + saldoConta);
            } else if (opcaoMenu == 3) {
                System.out.println("Digite o valor a tranferir:");
                double valorTransferir = leitura.nextDouble();

                if(valorTransferir > saldoConta){
                    System.out.println("Saldo em conta insuficiente!");
                }else{
                    saldoConta -= valorTransferir;
                    System.out.println("Novo saldo: " + saldoConta);
                }
            } else if (opcaoMenu == 4) {
                break;
            } else {
                System.out.println("Opção invalida, tente novamente!");
            }
        }
    }
}
