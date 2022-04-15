package P2;

import P1.Product;

public class ElectronicsProduct extends Product {
   private double accesoriesPrice;

    ElectronicsProduct( String p, String m, double b, double s,double a ){
       super(p,m,b,s);
        accesoriesPrice = a;
    }
    public double getAccesoriesPrice(){
        return accesoriesPrice;
    }
    public void setAccesoriesPrice( double accessoriesPrice){
        this.accesoriesPrice = accessoriesPrice;
    }
    void printProfit(){
       double productProfit = getBuyingPrice()-getSellingPrice()+accesoriesPrice;

        System.out.printf("Profit : "+productProfit);
    }
}
