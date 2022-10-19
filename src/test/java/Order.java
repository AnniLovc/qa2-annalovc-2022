import java.math.BigDecimal;

public class Order {
   //-------------ATRIBUTES----------------------
   Integer a = 14;
   Long b = 37848983L;
   BigDecimal bugdecimal = new BigDecimal("16.36");

   private double totalPrice;
   private double weight;
   private double volume;
   private int itemCount;
   private double height;
   private double width;
   private double depth;
   private String address;


   //-----------------GETTER/SETTER-------------------


   public Integer getA() {
      return a;
   }

   public void setA(Integer a) {
      this.a = a;
   }

   public Long getB() {
      return b;
   }

   public void setB(Long b) {
      this.b = b;
   }

   public BigDecimal getBugdecimal() {
      return bugdecimal;
   }

   public void setBugdecimal(BigDecimal bugdecimal) {
      this.bugdecimal = bugdecimal;
   }

   public double getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(double totalPrice) {
      this.totalPrice = totalPrice;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public double getVolume() {
      return volume;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public int getItemCount() {
      return itemCount;
   }

   public void setItemCount(int itemCount) {
      this.itemCount = itemCount;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getDepth() {
      return depth;
   }

   public void setDepth(double depth) {
      this.depth = depth;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}

