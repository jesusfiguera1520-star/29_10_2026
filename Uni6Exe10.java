import java.util.Scanner;

public class Uni6Exe10 {
    private int HexaParaDec (String n) {
        int Dec = 0; int num = 0;
        for (int i=0; i<n.length(); i++) {
            
              switch (n.charAt(i)) {
                case '0': Dec = Dec + 0 * Math.powExact(16, n.length()-1-i); break;
                case '1': Dec = Dec + 1* Math.powExact(16, n.length()-1-i); break;
                case '2': Dec = Dec + 2* Math.powExact(16, n.length()-1-i); break;
                case '3': Dec = Dec + 3* Math.powExact(16, n.length()-1-i); break;
                case '4': Dec = Dec + 4* Math.powExact(16, n.length()-1-i); break;
                case '5': Dec = Dec + 5* Math.powExact(16, n.length()-1-i); break;
                case '6': Dec = Dec + 6* Math.powExact(16, n.length()-1-i); break;
                case '7': Dec = Dec + 7* Math.powExact(16, n.length()-1-i); break;
                case '8': Dec = Dec + 8* Math.powExact(16, n.length()-1-i); break;
                case '9': Dec = Dec + 9* Math.powExact(16, n.length()-1-i); break;
                case 'A': Dec = Dec + 10* Math.powExact(16, n.length()-1-i); break;
                case 'B': Dec = Dec + 11* Math.powExact(16, n.length()-1-i); break;
                case 'C': Dec = Dec + 12* Math.powExact(16, n.length()-1-i); break;
                case 'D': Dec = Dec + 13* Math.powExact(16, n.length()-1-i); break;
                case 'E': Dec = Dec + 14* Math.powExact(16, n.length()-1-i); break;
                case 'F': Dec = Dec + 15* Math.powExact(16, n.length()-1-i); break;
            }
        } return Dec;
    }
    private String DecParaHex (int n) {
        String Hexa = ""; int resto = 0;
        while (n>0) {
            resto = n % 16;
            switch (resto) {
                case 10: Hexa = 'A' + Hexa; break;
                case 11: Hexa = 'B' + Hexa; break;
                case 12: Hexa = 'C' + Hexa; break;
                case 13: Hexa = 'D' + Hexa; break;
                case 14: Hexa = 'E' + Hexa; break;
                case 15: Hexa = 'F' + Hexa; break;
                default: Hexa = resto + Hexa; break;
            }
        } return Hexa;
    }
    private String DecParaBin (int n) {
        String Bina = ""; int dec = 0; int passo = 0;
        while (n>0) {
            dec = n % 2;
            Bina = dec + Bina;
            n = n / 2;
        } return Bina;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int mn = tec.nextInt();
        Uni6Exe10 dcxb = new Uni6Exe10();
        String result = dcxb.DecParaBin(mn);
        System.out.print(result);
    }
}
