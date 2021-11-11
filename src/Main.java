import static com.company.Shop.*;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        setProducts();
        setDiscountCards();

        for (int i = 0; i < getProducts().size(); i++) {
            System.out.println(getProducts().get(i).toString());
        }
        for (int i = 0; i < getDiscountCards().size(); i++) {
            System.out.println(getDiscountCards().get(i).toString());
        }
    }
}