package dio.java.desafio.desafio4;

import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i < n   ; i++) {
            if (n % i == 0) {
                System.out.println(  i     );
            }
        }
        System.out.println(  n      );
    }
}

