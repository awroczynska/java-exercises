public class MergingF {
    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = b.length - 1;
        int k = 0;

        while (i < a.length && j >= 0){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j--;
            }
            k++;
        }


        while (i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j >= 0){
            c[k] = b[j];
            j--;
            k++;
        }
        return c;

    }

        public static void main(String[] args){
            int[] a = {3, 9, 14, 14, 19};
            int[] b = {15, 2, 2, 0, -1};
            int[] c = merge(a, b);
            for (int e : c)
                System.out.print(e + " ");
            System.out.println();
        }
}
