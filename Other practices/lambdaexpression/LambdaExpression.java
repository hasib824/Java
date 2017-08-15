package lambdaexpression;

import java.util.*;


public class LambdaExpression {

    
    public static void main(String[] args) {
        List<Integer> ma = Arrays.asList(10,15,20,25);
        
       MyLambda ml = (x,y) -> (x%y)==0;       
      // ml.accept();
       
      if(ml.accept(10, 2))
      {
          System.out.println("10 is divided by 2");
      }      
      if(!ml.accept(10, 3))
      {
          System.out.println("10 is not devided by 3");
      }
      
      BlockLambda bl = (x,y) -> {
        int result = x ;
        for(int i=2;i<=y;i++)
        {
            result = result*2;
           // System.out.println(result);
        } 
        
        return result;  
    };
        int myLambda = bl.myLambda(2, 13);
      System.out.println("2^13 is : "+ myLambda);
      
      
      
      
        // String Manipulate
        String stringOp = stringOp(s-> s.toUpperCase(),"I am Hasib");
        System.out.println("String in UpperCase : "+ stringOp);
        
       StringGame stgm = s -> {
            String finals="";
            for(int i =0; i<s.length();i++) finals = finals+ Character.toLowerCase(s.charAt(i));
            return finals;
        };
        
        String stringOp1 = stringOp(stgm,"I am Hasib"); 
        System.out.println("String in LowerCase : "+stringOp1);
              
    }
    
    
    public static String stringOp(StringGame stg,String s)
    {
        return stg.stringMani(s);
    }
    
}





