package P1;

public class Product {
     private String productld;
     private String manufactureer;
     private double buyingPrice;
     private double sellingPrice;

    public Product(String p, String m, double b, double s){
        productld=p;
        manufactureer=m;
        buyingPrice=b;
        sellingPrice=s;
    }
    public String getProductld(){
        return productld;
    }
    public void setProductld(String newProduct){
        this.productld = productld;
    }
    public String getManufactureer(){
        return manufactureer;
    }
    public void setManufactureer(String newManufactureer){
        this.manufactureer = manufactureer;
    }
    public double getBuyingPrice(){
        return buyingPrice;
    }
    public void setBuyingPrice(double buyingPrice){
        this.buyingPrice = buyingPrice;
    }
    public double getSellingPrice(){
        return sellingPrice;
    }
    public void setSellingPrice(double newSellingPrice){
        this.sellingPrice = sellingPrice;
    }

}
