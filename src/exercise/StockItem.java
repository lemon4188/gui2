package exercise;

public class StockItem {
    private static String stockNumber;
    private static String name;
    private double price;
    private int totalStock=0;

    public StockItem(String stockNumber,String name,double price){
        this.stockNumber=stockNumber;
        this.name=name;
        this.price=price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void increaseTotslStock(int Stock){
        totalStock=totalStock+Stock;
    }

    public String getStockNumber(){
        return stockNumber;
    }

    public String getName(){
        return name;
    }

    public int getTotalStock(){
        return totalStock;
    }

    public double getPrice(){
        return price;
    }

    public double calculateTotalPrice(){
        return (price*(double)totalStock);
    }

    public static void main(String[] args){
        StockItem TV=new StockItem("001","TV",1000.0);
        TV.increaseTotslStock(200);
        System.out.println(TV.name);

    }
}
