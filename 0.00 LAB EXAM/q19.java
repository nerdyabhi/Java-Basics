
class nahiMilaException extends Exception {

    nahiMilaException(String s) {
        super(s);
    }
}

class q19 {

    public static void main(String[] args) {
        String cityNames[] = {"Chennai", "Mumbai", "Delhi", "Bangalore", "Amedabad"};
        String cityToFind = "Kolkata";
        boolean flag = true;

        try {
            for (int i = 0; i < cityNames.length; i++) {
                if (cityNames[i] == cityToFind) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                throw new nahiMilaException("Kolkata is fine , no thanks.");
            } else {
                System.out.println("okay vro");
            }

        } catch (nahiMilaException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
