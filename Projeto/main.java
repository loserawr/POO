import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        mensalista mes = new mensalista();
        horalista hora = new horalista();
        funcionario fun = new funcionario();
        Scanner leitor = new Scanner(System.in);
        
        
    
    int opc = 0;
    
    while (opc != 3) {
        System.out.println(""
        + "------ Consulta de Salario ------\n"
        + "1 - Funcionario Horalista\n"
        + "2 - Funcionario Mensalista\n"
        + "3 - Sair\n"
        + "---------------------------------");
        opc = leitor.nextInt();

        switch (opc) {
            
            case 1:
                System.out.println("Quantas horas você trabalhou esse mês? ");
                hora.setHorasTrab(leitor.nextInt());
                hora.calculoHora();
                System.out.println("O seu salario com base nas horas que você trabalho e no valor da sua hora(R$12.00) ficou: " + hora.getSalarioHora());
                trabalho(hora); // Puxando metodo através de poliformismo
                System.out.println();
                System.out.println();
                break;
            
            case 2:
                System.out.println("Quantos dias você trabalhou nesse mês(30 Dias): ");
                mes.setDiasTrab(leitor.nextInt());
                mes.calcMess();
                System.out.println("O seu salario com base na quantiade de dias que você trabalhou nesse mês ficou: " + mes.getCalcSal());
                trabalho(mes); // Puxando metodo através de poliformismo
                System.out.println();
                System.out.println();

            break;

            case 3:
                System.out.println("Obrigado pelo uso do progama, Funcionario");
                trabalho(fun); // Puxando metodo através de poliformismo
                System.out.println();
                System.out.println();
            break;

            
            default:
                System.out.println("Opção invalida.");
                break;
        }
    }

    
    leitor.close();
   }


    static void trabalho(funcionario x) { // Definino metodo para instanciar o poliformismo
        System.out.println(x.realizarTarefa());
    }
}
