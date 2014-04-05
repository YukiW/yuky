public class pn_check {
	public static void main(String[] args) {
        int i, n, c=0, s=Integer.parseInt(args[0]);
        // 与えられた数値内で調べる
        for(n=2; n<s; n++) {
            // nを割り切るiを見つける
            for(i=n/2; n%i!=0; i--);
            // 素数だけ表示
            if(i==1){
                System.out.println(n);
                c++;
            }
        }
        System.out.println("素数は"+c+"個です。");
	}
}