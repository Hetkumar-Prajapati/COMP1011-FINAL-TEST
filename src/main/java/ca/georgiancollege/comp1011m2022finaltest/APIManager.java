package ca.georgiancollege.comp1011m2022finaltest;

import java.nio.file.Files;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.simple.parser.*;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class APIManager
{
    /********************* SINGLETON SECTION ****/
    // Step 1. private static instance member variable
    private static APIManager m_instance = null;
    // Step 2. make the default constructor private
    private APIManager() {}
    // Step 3. create a public static entry point / instance method
    public static APIManager Instance()
    {
        // Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {
            // Step 5. Instantiate a new DBManager instance
            m_instance = new APIManager();
        }
        return m_instance;
    }
    /*************************************************/


    /* TODO -- Fill in with useful methods to read Customer information */

    public ArrayList<Customer> readCustomerTable()
    {
        // Instantiates an ArrayList collection of type Vector2D (empty container)
        ArrayList<Customer> customers = new ArrayList<Customer>();
        try
        {
            byte[] mapData = Files.readAllBytes(Paths.get("customer_data.txt"));
            Customer[] customerArr = null;

            ObjectMapper objectMapper = new ObjectMapper();
            customerArr = objectMapper.readValue(mapData, Customer[].class);
            List<Customer> customerList= Arrays.asList(customerArr);
            System.out.println("Customer 1 \n"+customerList.get(0));
            System.out.println("Customer 2 \n"+customerList.get(1));

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        return customers;
    }

//    public Customer getCustomerFromOMDBBByFirstNameAndLastName(String firstName, String lastName)
//    {
//        String APIKey ="";
//        return null;
//    }

    // parsing file "JSONExample.json"
//    Object obj = new JSONParser().parse(new FileReader("customers.json"));
//
//    // typecasting ob to JSONObject
//    JSONObject js = (JSONObject) obj;
//
//    String firstName = (String) js.get("firstName");
//    String lastName = (String) js.get("lastName");

//        System.out.println("First name is: " + firstName);
//        System.out.println("Last name is: " +lastName);

}
