package com.leapfrog.calcu;

public class Calculation {
    float max,min;
    public double ADD(float a, float b){
       return a+b;
    }
    public double SUB(float c, float d){
        return c-d;
    }
    public double MUL(float e, float f){
        return e*f;
    }
    public double DIV(float g, float h){
        return g/h;
    }
    public double POWER(float i, float j){
        return Math.pow(i,j);
    }
    public char MAX(float k, float l){
            if(k>l)
    {
            return 'k';
            
    }
    else 
    {
             return 'l';
            
    }
   
    }
    
    public double MIN(float m, float n)  {  
                    if(m<n)
    {
            min =m;
    }
    else 
    {
             min = n;
    }
    return min;
    }
    
}
