
class q20 {

    public static void main(String[] args) {
        int num = 15;
        int deno = 0;
        int quotient = -1;

        try {
            quotient = num / deno;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.getMessage());
        } finally {
            if (quotient == -1) {
                System.out.println("Exception Occurred");
            } else {
                System.out.println("The quotient is : " + quotient);

            }
        }

    }
}
