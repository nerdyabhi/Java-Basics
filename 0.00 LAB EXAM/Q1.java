
class Q1 {

    public static void main(String args[]) {
        if (args.length <= 0 || args.length > 2) {
            System.out.println("Please Enter a valid Number");
        } else {
            int n = Integer.parseInt(args[0]);
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(n + " is a prime Number");
            } else {
                System.out.println(n + " is not a prime Number");
            }
        }
    }
}
