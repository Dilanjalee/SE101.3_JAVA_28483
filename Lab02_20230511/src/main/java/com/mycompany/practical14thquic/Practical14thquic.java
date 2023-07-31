package com.mycompany.practical14thquic;
public class Practical14thquic
{

    public static void main(String[] args)
    {
    
        int[] numbers={10,20,30,40,50};
        for(int x:numbers)
        {
            switch(x)
            {
                case 30:
                    
                continue;
                
                default:
                    System.out.println(x);
        
            }
        }
        System.out.print("\n");
        System.out.println("I'm out of the loop now");
    }
}
