
class Q4Palin {

    public static boolean isPalin(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length <= 0 || args.length > 1) {
            System.out.println("Please Enter valid data");
            return;
        }

        if (isPalin(args[0])) {
            System.out.println(args[0] + " is palindrome");
        } else {
            System.out.println(args[0] + " is not palindrome");
        }
    }

}
