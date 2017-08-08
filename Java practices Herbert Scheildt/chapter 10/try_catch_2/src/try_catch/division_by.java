package try_catch;

import java.util.Random;

 class division_by {

    int a = 0, b = 0, c = 0;

    void MyMethod() {
        Random as = new Random();
        for (int i = 1; i < 3; i++) {
            try {
                b = as.nextInt();
                c = as.nextInt();
                a = (1234 / (b / c));
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Assign korar age : "+ a);
                a=0;
            }
            System.out.println("Value a is : "+ a);
        } // end of for 

    }  // End of My method 
    public String toString()
    {
        return "Hasibuzzaman";
    }
    public String toString(String a)
    {
        return "Hasibuzzaman"+ a;
    }
    
}
