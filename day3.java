class day3 {
    public static void main(String args[]) {
        int a[] = { 1, 90, 34, 23, 14, 21, 45, 221, 9, 2, 5 };
        // sorting bubble sort;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                // for (int k = 0; k < a.length - i; k++) {
                // System.out.print(a[k] + " ");
                // }
                // System.out.println();
                if (a[j - 1] < a[j]) {
                    a[j - 1] += a[j];
                    a[j] = a[j - 1] - a[j];
                    a[j - 1] = a[j - 1] - a[j];
                }
            }

        } // after sort
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}