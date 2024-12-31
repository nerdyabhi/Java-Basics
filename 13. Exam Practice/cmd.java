
class cmd {

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Please provide data from command");
        } else {
            System.out.print("You entered : ");
            for(int i=0; i<args.length; i++){
                System.out.print(args[i] + " ");
            }
        }
    }
}
