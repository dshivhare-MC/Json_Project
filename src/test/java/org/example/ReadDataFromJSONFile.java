package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJSONFile
{
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser Jsonparser=new JSONParser();
        FileReader reader=new FileReader("JsonFile/Employee.json");
        Object obj=Jsonparser.parse(reader);
        JSONObject empObj=  (JSONObject) obj;

        String fName=(String)empObj.get("firstName");
        String lName=(String)empObj.get("lastName");

        System.out.println("First Name is "+ fName);
        System.out.println("last Name is "+ lName);

        JSONArray jsonarray=(JSONArray) empObj.get("address");
        for (int i=0;i<jsonarray.size();i++)
        {
            JSONObject address=(JSONObject) jsonarray.get(i);
            String street=(String) address.get("street");
            String city=(String) address.get("city");
            String state=(String) address.get("state");

            System.out.println("Address of "+i+" is......" );
            System.out.println("street is "+ street);
            System.out.println("city is "+ city);
            System.out.println("state is "+ state);


        }



    }
}
