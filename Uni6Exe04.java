import java.util.Scanner;

public class Uni6Exe04 {

    private int NumVog (String fra) {
        int i = 0; int Contad = 0;
        while (i<fra.length()) {
            char letra = fra.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                Contad++;
            }
            i++;
        } return Contad;
    }

    private int ValNum (String fra) {
        int i = 0; String Val = ""; char In = fra.charAt(i); String Erro = "0"; 
        while (i<fra.length() && In != ' '){
        if (In == '0'||In == '1'||In == '2'||In == '3'||In == '4'||In == '5'||In == '6'||In == '7'||In == '8'||In == '9') {
            while (In >= '0' && In <= '9') {
                Val = Val + In;
                i++;
                In = fra.charAt(i);
                } return Integer.parseInt(Val);
            } 
        } return Integer.parseInt(Erro);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe sua frase: ");
        String frase = tec.nextLine();
        Uni6Exe04 nova = new Uni6Exe04();
        int A = nova.NumVog(frase);
        System.out.println("Vogais do texto: " + A);
        int B = nova.ValNum(frase);
        System.out.println("Valor númerico: " + B);
    }
}
