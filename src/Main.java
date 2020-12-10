import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            int i;
            boolean ktnt = true;
            for ( i = 2; i < N; i++ )
                if ( N % i == 0)
                    ktnt = false;
            if (ktnt) {
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
