import javax.swing.*;
public class InvoiceTest {


 public static void main(String[] args) {
  Invoice invoice=new Invoice("","",1,10.0);
  // TODO Auto-generated method stub
  String partnum;
  String partdesc;
  String qty;
  String price;
  
 partnum=JOptionPane.showInputDialog(null, "Enter Part Number ");
 invoice.setPartNumber(partnum);
 partdesc=JOptionPane.showInputDialog(null,"Enter Part Description ");
 invoice.setPartDescription(partdesc);
 
 price=JOptionPane.showInputDialog(null,"Item Price");
 double va1=Double.parseDouble(price);
 invoice.setItemPrice(va1);
 qty=JOptionPane.showInputDialog(null,"Enter Quantity ");
 int va = Integer.parseInt(qty);
 invoice.setQty(va);
 
 String prtnm=invoice.getPartNumber();
 String prtdsc=invoice.getPartDescription();
 int q=invoice.getQty();
 double pr=invoice.getItemPrice();
 double amount=invoice.getInvoiceAmount(invoice.getQty(),invoice.getItemPrice());
 
 JOptionPane.showMessageDialog(null,"Part Number : "+prtnm+"\nPart Description : "+prtdsc+"\nQuantity : "+q+"\nPrice : "+pr+"\nTotal Cost : "+amount);
  

 }

}
