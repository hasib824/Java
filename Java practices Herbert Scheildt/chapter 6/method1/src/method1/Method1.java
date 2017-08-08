package method1;

public class Method1 {

    public static void main(String[] args) {
       Box one=new Box();
       one.myvol(5, 10, 8);
        System.out.println("The result is : "+ one.volume());
    }
    
}

class Box
{
    int width;
    int height;
    int length;
    int volume()
    {
        return width*height*length;
    }
    void myvol(int x,int y,int z)
    {
        width=x;
        height=y;
        length=z;
    }
}
