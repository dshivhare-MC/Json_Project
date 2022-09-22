package org.example;

public class ChildClass extends BaseClass
{
    public void demo(int x)
    {
        System.out.println("demo method of Child Class");
    }

    public static void main(String args[])
    {

        ChildClass obj = new ChildClass();
        obj.demo();
        obj.demo(25);
    }
}
