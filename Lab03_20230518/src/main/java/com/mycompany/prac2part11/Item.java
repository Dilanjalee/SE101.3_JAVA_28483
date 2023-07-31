package com.mycompany.prac2part11;
public class Item
{
    private int location;
    private String description;
    public void setValues(int l,String d)
    {
        location=l;
        description=d;
    }
    public void display()
    {
        System.out.println("Item Location: "+location);
        System.out.println("Item Description: "+description);
    }
}
