package interface_default_method;

public class Interface_default_method {

    public static void main(String[] args) {
        Imple asd = new Imple();
        System.out.println("The value is : " + asd.me());
        System.out.println("The default is : " + asd.tr());
        Malik doya=new Malik();
        System.out.println("Now default is implemented : "+ doya.tr());
    }

}

interface Test {

    int me();

    default String tr() {
        return "Hasibuzzaman Allahr Banda";
    }
}

class Imple implements Test {

    public int me() {
        return 20;
    }

}

class Malik implements Test {

    public int me() {
        return 0;
    }
    public String tr()
    {
        return "Hasib Rasul(sm) er golam";
    }
}
