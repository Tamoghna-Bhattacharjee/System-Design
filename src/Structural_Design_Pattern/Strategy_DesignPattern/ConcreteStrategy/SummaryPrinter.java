package Structural_Design_Pattern.Strategy_DesignPattern.ConcreteStrategy;

import Structural_Design_Pattern.Strategy_DesignPattern.Order;
import Structural_Design_Pattern.Strategy_DesignPattern.Strategy.OrderPrinter;

import java.util.Collection;

public class SummaryPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************** Summary Report ***********");
        double total = 0;
        for (Order order: orders) {
            System.out.println(order.getId() + "\t" + order.getDate() + "\t"
                            + order.getItems().size() + "\t" + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("*****************************************");
        System.out.println("Total spent: " + total);
    }
}
