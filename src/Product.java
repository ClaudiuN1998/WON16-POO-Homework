public class Product {
    String nameProduct;
    int priceProduct;
    int quantityProduct;
    String categoryOfProduct;
    private int q;


    String getName(){
        return nameProduct;
    }
    int getPrice(){
        return priceProduct;
    }
    int getQuantity(){
        return quantityProduct;
    }
    String getCategory(){
        return categoryOfProduct;
    }
    boolean hasStock() {
        return quantityProduct != 0;
    }


}


