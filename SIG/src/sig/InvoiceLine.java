/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig;



/**
 *
 * @author Sheri
 */
class InvoiceLine {
  
        private String ItemName;
        private double ItemPrice;
        private int count;
        private int Itemtotal;
        private InvoiceHeader inv;

  public InvoiceLine(String ItemName,double Itemprice,int count,int Itemtotal){
        this.ItemName=ItemName;
        this.ItemPrice=ItemPrice;
        this.count=count;
        this.Itemtotal=Itemtotal;
        this.inv=inv;
        
    }
  public double getTotal(){
      return count * ItemPrice;
  }
  public InvoiceHeader getInv(){
      return inv;
  }
  public void setinv(InvoiceHeader inv){
      
      
  }
  }