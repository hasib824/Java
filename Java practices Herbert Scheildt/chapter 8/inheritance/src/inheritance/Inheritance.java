package inheritance;


public class Inheritance {


    public static void main(String[] args) {
       animal an=new animal();
       an.i=10;
       an.j=20;
       an.showij();
    }
}

class animal
{
    int i, j;
    void showij()
    {
        System.out.println("The result is : "+i+" "+ j);
    }
}
class dog extends animal
{
    int k;
    void showk()
    {
        System.out.println("The value of k is : "+ k);
    }
}
