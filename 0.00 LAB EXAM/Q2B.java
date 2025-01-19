
class Q2B {

    public static boolean checkPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String args[]) {

        if (args.length < 2) {
            System.out.println("Please Enter valid data");
        }
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        System.out.print("Prime Numbes are : ");
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
