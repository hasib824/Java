package jogbiyog;
public class Jogbiyog {

    public static void main(String[] args) {
        // TODO code application logic here
        myclass<Integer> l=new myclass<Integer>(10);
    }
    
}

class myclass<T extends Number>
{  
    T ob;
    myclass(T o)
    {
        ob=o;
    }
    public void mymethod()
    {
        System.out.println(ob+ob); 
    }
}