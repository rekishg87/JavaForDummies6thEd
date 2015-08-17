package chapters.chapter12.examples;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by Rekish on 8/17/2015.
 */
public class TallySales {

    public static void main(String args[]) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        NumberFormat currency =
                NumberFormat.getCurrencyInstance();

        fillTheList(sales);

        double total = 0;
        for (Sale sale : sales) {
            if (sale.item.equals("DVD")) {
                total += sale.price;
            }
        }

        System.out.println(currency.format(total));
    }

    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Book", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));
    }
}
