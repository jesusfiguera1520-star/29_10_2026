import java.util.Scanner;
public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int Voto, Chapa1, Chapa2, Chapa3, Chapa4, ContNu, ContBr;
        Chapa1 = 0;
        Chapa2 = 0;
        Chapa3 = 0;
        Chapa4 = 0;
        ContBr = 0;
        ContNu = 0;
        do {
            System.out.println("Escolha sua opção: ");
            System.out.println("1 - Chapa 1");
            System.out.println("2 - Chapa 2");
            System.out.println("3 - Chapa 3");
            System.out.println("4 - Chapa 4");
            System.out.println("5 - Voto Nulo");
            System.out.println("6 - Voto em branco");
            Voto = tec.nextInt();
            //contabilizar o Voto
            switch (Voto) {
                case 1: Chapa1++; break;
                case 2: Chapa2++; break;
                case 3: Chapa3++; break;
                case 4: Chapa4++; break;
                case 5: ContNu++; break;
                case 6: ContBr++; break;
                default:
                    if (Voto != 0) {
                        System.out.println("Opção Inválida");
                    }
                    break;
            }
        } while (Voto != 0);
        System.out.println("Votos da Chapa 1  : " + Chapa1);
        System.out.println("Votos da Chapa 2  : " + Chapa2);
        System.out.println("Votos da Chapa 3  : " + Chapa3);
        System.out.println("Votos da Chapa 4  : " + Chapa4);
        System.out.println("Votos em branco   : " + ContBr);
        System.out.println("Votos Nulos       : " + ContNu);
        int TotalVotos = Chapa1+Chapa2+Chapa3+Chapa4+ContBr+ContNu;
        System.out.printf("%% de brancos e nulos: %.2f%%", ((double) (ContBr+ContNu)/TotalVotos));
    }
}
