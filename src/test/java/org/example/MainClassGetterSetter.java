package org.example;

public class MainClassGetterSetter
{
    public static void main(String[] args)
    {
        BaseClassGetterSetter getSet= new BaseClassGetterSetter();
        getSet.setEmpId(144);
        getSet.setName("Deepu Shivhare");
        getSet.setAge(30);

        System.out.println("Employee Id : "+getSet.getEmpId());
        System.out.println("Employee Name : " + getSet.getName());
        System.out.println("Employee Age : " + getSet.getAge());
    }


}
