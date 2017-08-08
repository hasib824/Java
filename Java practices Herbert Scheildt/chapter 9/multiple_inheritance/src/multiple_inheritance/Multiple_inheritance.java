package multiple_inheritance;

public class Multiple_inheritance {

    public static void main(String[] args) {
        human hasib = new human();
        System.out.println(hasib.doya());
    }

}

interface Allah {

    int Aa();

    default String doya() {
        return "Allah is the most mercifull";
    }
}
interface Rasul  {

    int asd();

    default String doya() {
        return " And Nobipak is our Rasul";
    }
}
//interface Rasul extends Allah {
//
//    int asd();
//
//    default String doya() {
//        //String S = Allah.super.doya();
//        return " And Nobipak is our Rasul";
//    }
//}

class human implements Allah,Rasul {

    public int Aa() {
        return 20;
    }

    public int asd() {
        return 50;
    }
    public String doya()
    {
        return "La ilaha Illa ho , Mohammadur Rasul(sm) ullah";
    }
}
