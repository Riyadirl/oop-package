package P3;

import P1.Product;

public class BookProduct extends Product {
    private double discount ;

     BookProduct(String p, String m, double b, double s,double d){
        super(p,m,b,s);
        discount = d;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    void printProfit(){
         double productProfit = getBuyingPrice()-getSellingPrice()-discount;
        System.out.printf("profit :"+ productProfit);
    }
}
