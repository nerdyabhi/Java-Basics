
class DesignPattern {

    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println("");
        }
    }

    public static void rectangle(int l, int b) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        System.out.println("");
    }

    public static void square(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        System.out.println("");
    }
}

class Q8Pattern {

    public static void main(String[] args) {
        DesignPattern.triangle(5);
        DesignPattern.rectangle(5, 4);
        DesignPattern.square(5);
    }
}
