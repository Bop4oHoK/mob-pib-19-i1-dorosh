package com.company;

import com.company.discount.DiscountCard;
import com.company.product.Beer;
import com.company.product.Snack;
import com.company.product.Steak;
import com.company.product.Product;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Serializable  {
    private static List<Product> products;
    private static List<DiscountCard> discountCards;
    public static List<Product> getProducts(){
        return products;
    }

    public static void setProducts(){
        products = new ArrayList<>();
        Snack chips = new Snack("Чипсеки", "Краб", BigDecimal.valueOf(0), BigDecimal.valueOf(160.00));
        products.add(chips);
        Beer lager = new Beer("Жигуль", "Бодрящее", BigDecimal.valueOf(0.10), BigDecimal.valueOf(55.99));
        products.add(lager);
        Steak pepper = new Steak("Пеппер", "Сочный", BigDecimal.valueOf(0.05), BigDecimal.valueOf(1500.00));
        products.add(pepper);
    }
    public static List<DiscountCard> getDiscountCards(){
        return discountCards;
    }
    public static void setDiscountCards() {
        discountCards = new ArrayList<>();
        DiscountCard boris = new DiscountCard(1, "8913", "Борис", LocalDate.of(2002, 1, 24));
        discountCards.add(boris);
    }
    public static void serializationShop() throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/com/company/shop.ser");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(Shop.getProducts());
        ous.writeObject(Shop.getDiscountCards());
        ous.close();
    }
    public static void deserializationShop() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/com/company/restaurant.ser"))){
            products = (ArrayList) ois.readObject();
            discountCards = (ArrayList) ois.readObject();
            ois.close();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
