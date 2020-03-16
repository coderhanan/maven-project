package com.nttdata.maven.Invoice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Invoice myInvoice = new Invoice(null, null, 0,0);
        myInvoice.getInvoice();
        myInvoice.getPrice();
        myInvoice.getPartDescription();
        myInvoice.getPartNumber(); 
        myInvoice.setPrice(100);
        myInvoice.setPartDescription("This is the description");
        
        myInvoice.setQuantity(1235);
       
        myInvoice.setPartNumber("100089");
        System.out.println("Total for your product "+myInvoice.getPartNumber()+" is "+(myInvoice.getPrice()*myInvoice.getQuantity()));
        
        
    }
}
