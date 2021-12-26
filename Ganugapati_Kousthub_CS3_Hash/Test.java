import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class Test 
{
    public static void main(String [] agrs) throws FileNotFoundException
    {
        /*
        BufferedReader reader;
        String file = "/Users/pigeon/Downloads/Vin-Car Dataset - 50k/Large Data Set.txt";
        reader = new BufferedReader(new FileReader(file));
        try{
            HashTable cars = new HashTable(500000);
            String line = reader.readLine();
            long start = System.currentTimeMillis();
             while(line != null)
            {
                String vin = line.substring(0,17);
                String year = line.substring(18,22);
                String make = line.substring(19,67);
                make.trim();
                String country = line.substring(67,line.length());
                country.trim();
                Car car = new Car(vin,year,make,country);
                VIN v = new VIN(vin);
                cars.put(v,car);
                line = reader.readLine();
            }
            long stop = System.currentTimeMillis();
            System.out.println(stop - start);
            System.out.println(cars.toString());
           
        }
        catch(Exception e)
        {
        }
        */
        StarChart starChart = new StarChart("/Users/pigeon/Downloads/Star and Constellation Data/stars.txt");
       
     }
       
}


