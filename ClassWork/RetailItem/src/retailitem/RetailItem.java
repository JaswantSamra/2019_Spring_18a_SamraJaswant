package retailitem;

/**
 *
 * @author Jaswant Singh Samra
 */
public class RetailItem {

 String  description;
 int     unitsOnHand;
 double  price;
  public RetailItem(String description, int unitsOnHand, double price) throws RetailItemError{
   this.description = description;
   this.unitsOnHand = unitsOnHand;
   this.price = price;
 }
}