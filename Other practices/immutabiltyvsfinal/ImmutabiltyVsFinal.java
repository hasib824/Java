
package immutabiltyvsfinal;

public class ImmutabiltyVsFinal {

    public static void main(String[] args) {
        // TODO code application logic here
    A a= new A(10);
    
    }
    
}

class A
{
    int i;
    A(int i)
    {
        this.i=i;
    }
    void append(int j)
    {
        this.i=i+j;
    }
}