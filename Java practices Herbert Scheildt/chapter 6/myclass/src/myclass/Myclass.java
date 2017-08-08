package myclass;

public class Myclass {

    public static void main(String[] args) {
       box mybox=new box();
       box mybox1=new box();
       
       mybox.width=5;
       mybox.height=20;
       mybox.length=5;
       double vol=  mybox.width* mybox.height*mybox.length;
        System.out.println("The value is : "+ vol); 
       
       mybox1.width=5;
       mybox1.height=2;
       mybox1.length=10;
       double vol1=  mybox1.width+mybox1.height+mybox1.length;
       System.out.println("The value is : "+ vol1); 
       
       box a=new box();
       box b=a;
       a.width=500;
       b.width=300;
       
        System.out.println("Now a.width is : "+ a.width+ " Now b.width is : "+ b.width);
        
        a=null;
        System.out.println("Now b.width is : "+ b.width);
   }
    
}
class box
{
    double width;
    double height;
    double length;
}
