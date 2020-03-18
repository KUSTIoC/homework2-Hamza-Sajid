public class Invoice {

 private String partNumber;
 private String partDescription;
 private int Qty;
 private double itemPrice;
 
 public Invoice(String prtNum,String prtDesc,int qty,double iTpr){
  
  setPartNumber(prtNum);
  setPartDescription(prtDesc);
  setQty(qty);
  setItemPrice(iTpr);
  
  
 }

 public double getItemPrice() {
  return itemPrice;
 }

 public void setItemPrice(double itemPrice) {
  this.itemPrice = itemPrice;
 }

 public int getQty() {
  return Qty;
 }

 public void setQty(int qty) {
  Qty = qty;
 }

 public String getPartDescription() {
  return partDescription;
 }

 public void setPartDescription(String partDescription) {
  this.partDescription = partDescription;
 }

 public String getPartNumber() {
  return partNumber;
 }

 public void setPartNumber(String partNumber) {
  this.partNumber = partNumber;
 }
 
 public double getInvoiceAmount(int qty,double price){
  
  double value=qty*price;
  return value;
 }

}