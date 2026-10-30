import java.util.Scanner;
public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int inscricao, insmalto, insmbaixo, quantidade;
        double altura, media, mediatotal, mbaixo, malto;
         
        mbaixo = Double.MAX_VALUE; //Maximo valor possivel
        malto = Double.MIN_VALUE; //Minimo valor possivel
        insmalto = 0;
        insmbaixo = 0;
        media = 0;
        quantidade = 0;

        System.out.print("Insira o n° de inscrição: ");
        inscricao = tec.nextInt();
        while (inscricao != 0) {
            System.out.print("Insira altura do atleta " + inscricao + ": ");
            altura = tec.nextDouble();
            if (altura < mbaixo) {
                mbaixo = altura;
                insmbaixo = inscricao;
            } else if (altura > malto) {
                malto = altura;
                insmalto = inscricao;
            }
            media += altura;
            quantidade++;
            System.out.print("Insira o n° de inscrição do seguinte atleta: ");
            inscricao = tec.nextInt();
        }
        mediatotal = media / quantidade;
        System.out.println("O atleta mais baixo tem " + mbaixo + "m e o seu número de inscrição é " + insmbaixo);
        System.out.println("O atleta mais baixo tem " + malto + "m e o seu número de inscrição é " + insmalto);
        System.out.printf("A altura média do grupo de atletas é: %.2fm%n", mediatotal);
    }
}
