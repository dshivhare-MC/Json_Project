package org.example;

import java.util.HashMap;
import java.util.Map;

public class HasMap
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> emp = new HashMap();
        emp.put("shivhare.deepu@gmail.com", 12345);
        emp.put("Amit.joshi@gmail.com", 23456);
        emp.put("shiv.Rathor@gmail.com", 34567);
        emp.put("John.hexa@gmail.com", 456789);

        for (Map.Entry<String, Integer> e : emp.entrySet()) {
            System.out.println("UserName: " + e.getKey());
            System.out.println("Password: " + e.getValue());
        }
   }
}
