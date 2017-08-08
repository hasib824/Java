package multuthread;

public class Multuthread {

    public static void main(String[] args) {
        // TODO code application logic here
        
        B as=new B();
        
    }

}

class A {

    int a, b;

    A() {
        a = 10;
        b = 5;
    }

    A(int x, int y) {
        a = x;
        b = y;
    }

    void start() {
        System.out.println("Start Values are : " + (a + b));
        run();
    }
    void run() {
        System.out.println("Run Values are : " + (a * b));
    }

}

class B extends A {
   int c=20,d=30;
    B(){
    super(20,30);
    start();
    }
    void run()
    {
        System.out.println("Aikhane subclass run hoise : ");
    }
}
