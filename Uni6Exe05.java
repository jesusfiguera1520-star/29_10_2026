import java.util.Scanner;

public class Uni6Exe05 {

    private boolean palindromo (String frase) {
        int inicio = 0; int fim = frase.length() - 1;
        //repeir até chegar no meio da frase
        while (inicio < fim) {
            //comparar se o caracter da esquerda equivale ao da direita
            if (frase.charAt(inicio) == frase.charAt(fim)) {
                //atualizar os indices
                inicio++;
                fim--;
            }
        }


    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni6Exe05 exe05 = new Uni6Exe05();

        // inicializar a quantidade de palindromos
        int quantidade = 0;
        System.out.println("Insira a frase: ");
        String frase = tec.nextLine();
        //enquanto não digitar palavra vacia
        while (!frase.equalsIgnoreCase("")) {
            // verificar se a frase é palindromo
            if (palindromo(frase)) {
                System.out.println("A frase é palindromo");
                quantidade++;
            } else {
                System.out.println("A frase não é palindromo");
            }
            //ler a frase
            System.out.println("Digite uma frase");
            frase = tec.nextLine();
        }
        System.out.println("Foram digitados" + quantidade + "palindromos");
    }
}
