package Behavioural_DesignPattern.Strateg.ConcreteStrategy;

import Behavioural_DesignPattern.Strateg.Order;
import Behavioural_DesignPattern.Strateg.Strategy.OrderPrinter;

import java.util.Collection;
import java.util.Map;

public class DetailPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************** Detail Printer ***************");
        double total = 0;
        for (Order order: orders) {
            total += order.getTotal();
            System.out.println("****** " + order.getId() + " " + order.getDate() + "******");
            for (Map.Entry<String, Double> i: order.getItems().entrySet()) {
                System.out.println(i.getKey() + "\t" + i.getValue());
            }
            System.out.println("*******************");
            System.out.println("Total for " + order.getId() + ": " + order.getTotal());
            System.out.println("*************");
        }
        System.out.println("******************************************");
        System.out.println("Total bill: " + total);
    }
}
