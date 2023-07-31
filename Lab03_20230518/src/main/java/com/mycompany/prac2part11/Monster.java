package com.mycompany.prac2part11;
public class Monster extends Item
{
    private int location;
    public void setLocation(int l)
    {
        location=l;
    }
    public void displayLocation
    {
        System.out.println("Item Location: "+location);
    }
    private String description;
    public void setDescription(String d)
    {
        description=d;
    }
    public void displayDescription
    {
        System.out.println("Item Description: "+description);
    }
}
