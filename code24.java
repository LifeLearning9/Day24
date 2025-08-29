import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);
        int len = s.length();

        if (len % 2 != 0) {
            System.out.println("Not a Tech Number");
            return;
        }

        int first = Integer.parseInt(s.substring(0, len / 2));
        int second = Integer.parseInt(s.substring(len / 2, len));
        int sum = first + second;

        if (sum * sum == n)
            System.out.println("Tech Number");
        else
            System.out.println("Not a Tech Number");
    }
}
