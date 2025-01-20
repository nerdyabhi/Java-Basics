
class Q7 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int arr[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = (j % 2 == 0) ? 1 : 0;
            }
        }

        // Print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
