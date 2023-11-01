import java.util.Scanner;
public class RPGCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas moedas você quer? ");
        int M = sc.nextInt();
        int[] coins = new int[M];

        System.out.println("Qual será o valor de CADA moeda? ");
        for (int i = 0; i < M; i++) {
            coins[i] = sc.nextInt();
        }
        // numero de pulos (2 em 2) ou (3 em 3)
        System.out.println("Qual será o número de pulos?");
        int N = sc.nextInt();

        int sum = calculateSum(coins, N);
        System.out.println("A Soma depois dos pulos é de:  " + sum);

        if (isPrime(sum)) {
            System.out.println("Robbie realizou o desejo de Glória!");
        } else {
            System.out.println("Glória convenceu Robbie para jogar novamente! >.< ");
        }
    }

    // calcular a soma das moedas que foram selecionadas
    static int calculateSum(int[] coins, int N) {
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            sum += coins[i] - (N * (i / N));
        }
        return sum;
    }

    // descobrir se é primo ou tio (não-primo k)
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
