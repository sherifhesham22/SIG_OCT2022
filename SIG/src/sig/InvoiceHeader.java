/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sheri
 */
public class InvoiceHeader {
    private int ID;
    private Date date;
    private String name;
    private ArrayList<InvoiceLine>Lines;
    public InvoiceHeader(int num,Date date,String name){
        this.ID=ID;
        this.date=date;
        this.name=name ;    
    }
      public double getTotal(){
      double total=0.0;
      for(int i=0;i<Lines.size();i++){
          InvoiceLine line =Lines.get(i);
           total+=line.getTotal();
              
      }
         
      
      return total;
     // return getLines().stream().mapToDouble(line->line.getTotal()).sum();
  }
    public ArrayList<InvoiceLine>getLines(){
        return Lines;
    }
    public String getname(){
        return name;
    }
    public void setname(String Name){
        this.name=name;
        
    }
    
}
