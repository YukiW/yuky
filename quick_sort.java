public class quick_sort {
    static void quickSort(int[] a, int left, int right) {
        /*  クイックソート
         *  a       : 要素配列      p   :   ピボット(データ中央値)
         *  left    : 開始位置      i   :   左側の配列位置
         *  right   : 終了位置      j   :   右側の配列位置
         */
        int i=left, j=right, t, p=a[(i+j)/2];
        while(true) {
            while(a[i] < p) i++;    // ピボット以上の値を先頭から探索
            while(p < a[j]) j--;    // ピボット以下の値を末尾から探索
            if(i>=j)break;          // 探索位置i,jが交差したら終了
            t=a[i];a[i]=a[j];a[j]=t; // 左右の値を交換
            i++; j--;               // 探索位置を1つずらす
        }
        // 分割
        // 左側を再帰的にソート
        if(left < i-1){ quickSort(a, left, i-1); }
        // 右側を再帰的にソート
        if(j+1 < right){ quickSort(a, j+1, right); }
    }
    
	public static void main(String[] args) {
        int[] a = {8, 10, 4, 14, 7, 5, 2, 1, 11, 13};
        quickSort(a, 0, a.length-1);
        for(int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
	}
}