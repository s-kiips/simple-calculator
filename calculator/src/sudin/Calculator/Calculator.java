package sudin.Calculator;

import com.leapfrog.calcu.Calculation;
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          float a,b,c,d,e,f,g,h,i,j,k,l,m,n;
          float ADD,SUB,DIV,MUL,POWER,MIN,MAX;
        Calculation calc = new Calculation();
          while(true){
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
        System.out.println("5. POWER");
        System.out.println("6. MAX");
        System.out.println("7. MIN");
        System.out.println("enter your choice [1-7]");
        switch (input.nextInt()){
            case 1:
            System.out.println("enter the value of a:");
                a=input.nextFloat();
            System.out.println("enter the value of b:");
                  b=input.nextFloat();
            
                System.out.println("addition"+calc.ADD(a, b));
                break;
                
                case 2:
            System.out.println("enter the value of c:");
                c=input.nextFloat();
            System.out.println("enter the value of d:");
                  d=input.nextFloat();
            
                System.out.println("subtraction"+calc.SUB(c, d));
                break;
                    
                    case 3:
            System.out.println("enter the value of e:");
                e=input.nextFloat();
            System.out.println("enter the value of f:");
                  f=input.nextFloat();
            
            System.out.println("addition"+calc.MUL(e, f));
            break;
                        
            case 4:
            System.out.println("enter the value of g:");
                g=input.nextFloat();
            System.out.println("enter the value of h:");
                h=input.nextFloat();
           
            System.out.println("addition"+calc.DIV(g, h));
            break;
                            
            case 5:
            System.out.println("enter the value of i:");
                i=input.nextFloat();
            System.out.println("enter the value of j:");
                j=input.nextFloat();
                
            System.out.println("power"+calc.POWER(i, j));
                break;
                       
            case 6:
            System.out.println("enter k:");
             k=input.nextFloat();
            System.out.println("enter the value of l:");
                l=input.nextFloat();
          
            System.out.println("MAX"+calc.MAX(k, l));
            break;
                
            case 7:
            System.out.println("enter m:");
             m=input.nextFloat();
            System.out.println("enter the value of n:");
            n=input.nextFloat();
             
            System.out.println("MIN"+calc.MIN(m, n));
             break;
                
              
                            
    }
              System.out.println("calculate another[Y/N]:");
         if(input.next().equalsIgnoreCase("n")){
                               System.exit(0);
          }//while  
}
}
}
