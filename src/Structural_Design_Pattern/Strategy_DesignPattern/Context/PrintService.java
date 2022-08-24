package Structural_Design_Pattern.Strategy_DesignPattern.Context;

import Structural_Design_Pattern.Strategy_DesignPattern.Order;
import Structural_Design_Pattern.Strategy_DesignPattern.Strategy.OrderPrinter;

import java.util.LinkedList;
import java.util.List;

public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
