public class factorial {
    static int fact(int n) {
        if(n==0) {
            return 1; // 0! = 1
        } else {
            return n * fact(n-1); // n! = n * (n-1)! ←ここが再帰呼び出し
        }
    }
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(0<n) {
            System.out.println(n+"! = "+fact(n));
        } else {
            System.out.println("※非負の整数値を入力してください。");
        }
    }
}