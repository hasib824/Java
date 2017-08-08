package vargas;

public class Vargas {
    public static void main(String[] args) {
        Box a=new Box();
        a.metho(1,2,3);
        a.metho(5,6,7,8);
    }
}

class Box
{
   int i, j;
   void metho(int ...n){
       System.out.println("the results are : ");
       for(int i : n)
       {
           System.out.print(i+", ");
       }
}
}

