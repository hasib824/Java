package ob_param;

public class Ob_param {


    public static void main(String[] args) {
        Box my=new Box(10,15,20);
        //my=null;
        Box clone=new Box();
        clone.width=5;
        clone.height=7;
        clone.length=10;
        Box my1=new Box(clone);
        System.out.println("the box for int is  : "+ my.volume());
        System.out.println("the box for int is  : "+ my1.volume());
    }    
}

class Box
{
   int width, height, length;
   Box(int width,int height,int length)
   {
       this.width=width;
       this.height=height;
       this.length=length;
   }
   Box(Box O1)
   {
       width=O1.width;
       height=O1.height;
       length=O1.length;
   }
   Box( )
   {
       width=-1;
       height=-1;
       length=-1;
   }
   int volume()
   {
       return width*height*length;
   }
}
