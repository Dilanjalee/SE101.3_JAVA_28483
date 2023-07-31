package com.mycompany.prac2part14;
public class Prac2Part14
{

    public static void main(String[] args)
    {
        ItemsGetterSetter i1=new ItemsGetterSetter();
        i1.setLocation(25);
        i1.setDescription("Biscuit");
        System.out.println("Item Location: "+i1.getLocation());
        System.out.println("Item Description: "+i1.getDescription());
    }
}
