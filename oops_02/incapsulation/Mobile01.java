/*Mobile
Create a class Mobile with:
private String brand
private int storage
private double price
Set values using setter and print using getter. */

package oops_02.incapsulation;

class Mobile{
    private String brand;
    private int storage;
    private double price;

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setStorage(int storage){
        this.storage=storage;
    }
    public int getStorage(){
        return storage;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
}

public class Mobile01 {
    public static void main(String[] args){
        Mobile m1=new Mobile();
        m1.setBrand("Redmi");
        m1.setStorage(512);
        m1.setPrice(14000.23);

        System.out.println(m1.getBrand());
        System.out.println(m1.getStorage());
        System.out.println(m1.getPrice());
    }
}
