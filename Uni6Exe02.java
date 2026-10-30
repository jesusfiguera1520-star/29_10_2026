import java.util.Scanner;

public class Uni6Exe02 {
    private int ContPalavras (String fra, String pal) {
        int i = 0;
        while (i < fra.length()) {
            if (pal)
        }
}
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira a frase: ");
        String frase = tec.nextLine();
        while (frase != "fim") {
            System.out.println("Insira a letra a procurar: ");
            String letra = tec.nextLine();
            Uni6Exe02 Busca = new Uni6Exe02();
            int result = Busca.ContadorLetras(frase, letra.charAt(0));
            System.out.println("A quantidade de vezes que aparece é: " + result);
            System.out.print("Insira a frase: ");
            frase = tec.nextLine();
        } if (frase == "fim") {
            System.out.println("Programa finalizado.");
        }
    }
}

}
