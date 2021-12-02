
/**
 *
 * Group members name and matric number:
 * 1) 
 * 2)
 * 3)
 * 4)
 * Class :
 */
import java.lang.*;
public class Cake
{
   private String custID; //D001, P003
   private String cakeType; //D24 Chocolate Cake,Red Velvet,Burnt Cheese Cake,Black Forest
   private int qty;
   private double price;
   
   public Cake(String ID,String cakeType, int qty)
   {    this.custID=ID;
        this.cakeType=cakeType;
        this.qty=qty;
   }
   
   public void setID(String ID){this.custID=ID;}
   public void setCakeType(String cakeType){this.cakeType=cakeType;}
   public void setQty(int qty){this.qty=qty;}
   
   //2.a)Write the retriever method for custID, cakeType and qty
  
   //2.b)Write the detPrice() method that will return the price of cake based on cakeType.Refer 2_GroupProject.docx
    
   //2.c)Write the toString method that will return the output look like as below:
   //Customer ID:XXXX	Cake Type:XXXXXXX	        Price: RM XX.XX	     Quantity:XX
  
      
}
