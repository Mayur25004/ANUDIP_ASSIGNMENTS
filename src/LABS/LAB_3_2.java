package LABS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Maths_Library
public class LAB_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        boolean prime= is_prime(n);
        System.out.println("is_prime "+ prime );

        System.out.println("Enter the range (start, end): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        List<Integer> prime_range = primes_in_range(start, end);
        System.out.println(prime_range);

        List<Integer> prime_fac = prime_factorization(n);
        System.out.println("prime factorization: "+prime_fac);

    }
    public static boolean is_prime(int num ){
        if (num < 2)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static List<Integer> primes_in_range(int start, int end){
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(is_prime(i)){
                list.add(i);
            }

        }
        return list;
    }
    public static List<Integer> prime_factorization(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
