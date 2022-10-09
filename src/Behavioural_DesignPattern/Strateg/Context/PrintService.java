package Behavioural_DesignPattern.Strateg.Context;

import Behavioural_DesignPattern.Strateg.Order;
import Behavioural_DesignPattern.Strateg.Strategy.OrderPrinter;

import java.util.LinkedList;

public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
