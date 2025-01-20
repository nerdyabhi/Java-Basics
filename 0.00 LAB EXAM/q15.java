
interface Volume {

    double inVolume();

    double outVolume();
}

class machine implements Volume {

    int s1, s2, s3;

    machine(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double inVolume() {
        return (1.0 / 3.0) * Math.PI * s1 * s2 * s3;
    }

    public double outVolume() {
        return (4.0 / 3.0) * Math.PI * s1 * s2 * s3;
    }

    public void displayVolume() {
        System.out.println("Involume : " + inVolume());
        System.out.println("OutVolume : " + outVolume());
    }

}

class q15 {

    public static void main(String[] args) {
        machine m = new machine(1, 2, 3);
        m.displayVolume();
    }
}
