import java.util.*;
import java.io.*;
import java.lang.*;
public class MyAss2QApp {
    public static void main(String[] args) throws Exception 
    {
        
        try
        {
            BufferedReader br = new BufferedReader (new FileReader ("cakeOrder.txt"));
            PrintWriter pickOut = new PrintWriter (new FileWriter ("pickup.txt"));
            PrintWriter delOut = new PrintWriter (new FileWriter ("delivery.txt"));
            Queue cakeQ=new Queue();
            Queue tempQ=new Queue();
            
            //a)b)c)read the data from cakeOrder.txt and insert into cakeQ
            
            //d)display the data in the cakeQ
            
            
            //e)The first character of custID is based on the delivery type. if the first character is 'P' 
	        //mean the customer choose to pickup the cake and if the first character is 'D', the customer 
            //choose to have delivery service. Example of custID are P002,D112 and etc. Write the data for delivery 
            //into delivery.txt output file and the data for customer that choose self pick up into pickup.txt. 
            
            
            
            //f)Display the total quantity order for each cake type and display the cake name of the highest total order
            
            
            //g)Display the receipt that will display the custID, cakeType, price(using detPrice() method), qty, 
	        //payment for each order. In order to calculate the payment for each order you need to multiply quantity 
	        //with the cake price and it is an extra charge of RM 5.00 for delivery service. Lastly, display the total 
            //payment for all the orders. 
              
                
            br.close();
            pickOut.close();
            delOut.close();
        }
        catch(Exception e) {System.err.println(e.getMessage());}
    
    } /***End of main() Method***/   
}/***End of Application Class***/