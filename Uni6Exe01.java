import java.util.Scanner;

public class Uni6Exe01 {
    private int ContadorLetras (String fra, char let) {
        int i = 0; int tam = fra.length(); int quantidade = 0;
        while (i < tam) {
            if (fra.charAt(i) == let) {
                quantidade++;
            }
            i++;
        }
        return quantidade;
}
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira a frase: ");
        String frase = tec.nextLine();
        while (frase != "fim") {
            System.out.println("Insira a letra a procurar: ");
            String letra = tec.nextLine();
            Uni6Exe01 Busca = new Uni6Exe01();
            int result = Busca.ContadorLetras(frase, letra.charAt(0));
            System.out.println("A quantidade de vezes que aparece é: " + result);
            System.out.print("Insira a frase: ");
            frase = tec.nextLine();
        } if (frase == "fim") {
            System.out.println("Programa finalizado.");
        }
    }
}
