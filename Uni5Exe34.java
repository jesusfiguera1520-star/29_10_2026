import java.util.Scanner;
public class Uni5Exe34 {
    public static void main (String[] args) {
        Scanner tec = new Scanner(System.in);
        int dias;
        double preco;
        System.out.println("Escolha o número da sua opção: ");
        System.out.println("1 - Encerrar a conta de um hóspede");
        System.out.println("2 - Verificar número de contas encerradas");
        System.out.println("3 - Sair");
        int Opçao = tec.nextInt();
        do {
            System.out.print("Insira o número de diárias: ");
            dias = tec.nextInt();
            System.out.print("Insira o nome do hóspede: ");
            String Nome = tec.nextLine();
            int Vdiarias = dias * 50;
            if (dias < 15) {
                preco = (7.50 * dias);
            } else if (dias == 15) {

            } else if (dias > 15) {

            }

        }
    }
}
