class Outer{
    String name;
    Outer(String name){
        this.name = name;
    }

    void getName(){
        System.out.println("Your name from outerClass is : " +  name);
    }
    class Inner{
        String name;
        Inner(String name){
            this.name = name;
        }

        void getName(){
            System.out.println("Your name from InnerClass is : " +  name);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Outer abhi = new Outer("Abhi Sharma");
        abhi.getName();

        Outer.Inner Jarvis =  abhi.new Inner("Jarvis Sharma");
        Jarvis.getName();
    }
}
