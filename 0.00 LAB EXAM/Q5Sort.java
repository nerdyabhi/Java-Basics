
class Q5Sort {

    public static void print(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n = args.length;

        System.out.println("Before Sorting : ");
        print(args);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int n1 = Integer.parseInt(args[j]), n2 = Integer.parseInt(args[j + 1]);
                if (n2 < n1) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting : ");
        print(args);

    }
}
