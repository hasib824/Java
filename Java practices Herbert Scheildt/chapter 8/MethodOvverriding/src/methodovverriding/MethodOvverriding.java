package methodovverriding;

public class MethodOvverriding {

    public static void main(String[] args) {
      Triangle a=new Triangle();
      a.k=50;
      a.showij();
    }    
}

class Box
{
    int i, j;
    void showij()
    {
        System.out.println("This is show i j :"+i+" "+j);
    }
}
class Triangle extends Box
{
    int k;
    void showij()
    {   super.showij();
        System.out.println("This is on 2nd");
    }
}