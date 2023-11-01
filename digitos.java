import java.util.Scanner;
public class digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String number = sc.next();
            // para converter a entrada -> array de caracters (rsrs)
            char[] digitos = number.toCharArray();
            // colocar digitos em ordem crescente né
            sortDigitos(digitos);
            // achar o primeiro digito que não é nulo !!!!!
            int firstNaoNullIndex = 0;
            while (firstNaoNullIndex < digitos.length && digitos[firstNaoNullIndex] == '0') {
                firstNaoNullIndex++;
            }
            // trocar o primeiro dígito com aquele de cima (o primeiro não nulo) !!
            if (firstNaoNullIndex < digitos.length) {
                char temp = digitos[0];
                digitos[0] = digitos[firstNaoNullIndex];
                digitos[firstNaoNullIndex] = temp;
            }
            // imprimir numerozinho da sorte
            System.out.println(new String(digitos));
        }
    }
    private static void sortDigitos(char[] digitos) {
        for (int i = 0; i < digitos.length - 1; i++) {
            for (int j = i + 1; j < digitos.length; j++) {
                if (digitos[i] > digitos[j]) {
                    char temp = digitos[i];
                    digitos[i] = digitos[j];
                    digitos[j] = temp;
                }
            }
        }
    }
}
