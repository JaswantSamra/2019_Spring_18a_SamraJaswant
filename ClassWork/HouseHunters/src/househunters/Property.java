/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package househunters;

/**
 *
 * @author Jaswant Singh Samra
 */
public class Property {
    Double price, sqft;
    Integer bedrooms, bathrooms;
    
    
    // Setter
    public void setPrice(Double p){
        this.price = p;
    }
     public void setsqft(Double s){
        this.sqft = s;
    }
      public void setbedrooms(Integer b){
        this.bedrooms = b;
    }
       public void setbathrooms(Integer ba){
        this.bathrooms = ba;
    }
       
    // Getter
    public Double getPrice(){
        return this.price;
    }
    public Double getsqft(){
        return this.sqft;
    }
    public Integer getbedrooms(){
        return this.bedrooms;
    }
    public Integer getbathrooms(){
        return this.bathrooms;
    }
    
    
    
    
}
