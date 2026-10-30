import java.util.Scanner;


public class SubRotinas {

    private int soma (int a,int b) {
        int total = a + b;

        return total;
    }

    private int subtra (int a,int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        SubRotinas exe = new SubRotinas();  //criando um objeo da propia classe para evitar o uso de método static (construtor)
        System.out.println("digite o primeiro numero: ");
        int numero1 = tec.nextInt();
        System.out.println("digite o segundo numero: ");
        int numero2 = tec.nextInt();

        double resultado = exe.soma (numero1, numero2);
        System.out.println("Soma = " + resultado);

        double resta = exe.subtra (numero1, numero2);
        System.out.println("Resta = " + resta);
    }
}
