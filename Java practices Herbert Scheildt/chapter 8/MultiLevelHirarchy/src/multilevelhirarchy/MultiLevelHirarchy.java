package multilevelhirarchy;

public class MultiLevelHirarchy {

        public static void main(String[] args) {
        ExtWeight as1=new ExtWeight(5,10,15,20);
        ExtWeight as=new ExtWeight(as1);
        System.out.println("The values are : "+ as.he +" "+ as.le+" "+as.wi);
        Shipment an=new Shipment();
        an.le=15;
        System.out.println("The value from 3rd class is : "+ an.le);
    }
    
}

class Box
{
    double height, width, length;
    double he, wi, le;
    Box()
    {
        System.out.println("This is A");
    }
    Box(Box ob)
    {
        he=ob.height;
        wi=ob.width;
        le=ob.length;
    }
    Box(double h,double l, double w)
    {
        width=w;
        length=l;
        height=h;
    }
    void volume()
    {
        System.out.println("The volume is "+ width*length*height);
    }
}
class ExtWeight extends Box
{
    double weight;
    ExtWeight()
    {
        System.out.println("This is B");
    }
    ExtWeight(ExtWeight ob)
    {
        super(ob);
    }
    ExtWeight(double h,double l, double w,double we)
    {
        super(h,l,w);
        weight=we;
    }
}

class Shipment extends ExtWeight
{   
    int m, k;
    Shipment()
    {
        System.out.println("This is C");
    }
    Shipment(Shipment a)
    {
        super(a);
    }


}
