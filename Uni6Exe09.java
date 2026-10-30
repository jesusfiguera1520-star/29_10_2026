import java.util.Scanner;

public class Uni6Exe09 {
    
    private long Fatorial (long a) {
        long produto = 1;
        for (long n = a; n > 1; n--) {
            produto = produto * n;
        }
        return produto;
    }

    private double Combinacao (long a, long b) {
        Uni6Exe09 ftrl = new Uni6Exe09();
        return (ftrl.Fatorial(a)) / ((ftrl.Fatorial(b))*(ftrl.Fatorial(a-b)));
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni6Exe09 comb = new Uni6Exe09();
        System.out.println("Insira a quantidade de elementos: ");
        long n = tec.nextLong();
        System.out.println("Insira o sucessão de elementos: ");
        long p = tec.nextLong();
        System.out.print("A combinação é: " + comb.Combinacao(n, p));
        System.out.print("O fatorial de n é: " + comb.Fatorial(n));
    }
}
