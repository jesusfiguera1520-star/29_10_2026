import java.util.Scanner;
public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float Canal, Pessoas, pub4, pub5, pub9, pub12,Audiencia4, Audiencia5, Audiencia9, Audiencia12;
        pub4 = 0;
        pub5 = 0;
        pub9 = 0;
        pub12 = 0;

        System.out.print("Insira o número do canal: ");
        Canal = tec.nextInt();
        while (Canal == 4 || Canal == 5 || Canal == 9 || Canal == 12) {
            System.out.print("Insira o número de pessoas assistindo: ");
            Pessoas = tec.nextFloat();
            
            if (Canal == 4) {
                pub4 = Pessoas;
            } else if (Canal == 5) {
                pub5 = Pessoas;
            } else if (Canal == 9) {
                pub9 = Pessoas;
            } else if (Canal == 12) {
                pub12 = Pessoas;
            } else {
                System.out.print("Insira um numero de canal valido");
            }
            System.out.print("Insira o número do canal: ");
            Canal = tec.nextFloat();
        }
        float AudenciaTotal = pub4 + pub5 + pub9 + pub12;
        Audiencia4 = (100*pub4) / AudenciaTotal;
        Audiencia5 = (100*pub5) / AudenciaTotal;
        Audiencia9 = (100*pub9) / AudenciaTotal;
        Audiencia12 = (100*pub12) / AudenciaTotal;
        System.out.printf("Percentual de audiência do canal 4: %.0f%%\n", Audiencia4);
        System.out.printf("Percentual de audiência do canal 5: %.0f%%\n", Audiencia5);
        System.out.printf("Percentual de audiência do canal 9: %.0f%%\n", Audiencia9);
        System.out.printf("Percentual de audiência do canal 12: %.0f%%\n", Audiencia12);
    }
}
