class Q3Fibo{
    public static int fibo(int n){
        if (n==0|| n==1) return 1;

        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String args[]){
        if (args.length < 1) {
            System.out.println("Please Enter valid data");
            return;
        }

        int n = Integer.parseInt(args[0]);
        for(int i=0; i<n; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}