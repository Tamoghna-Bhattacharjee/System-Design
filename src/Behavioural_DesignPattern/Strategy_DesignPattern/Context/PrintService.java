package Behavioural_DesignPattern.Strategy_DesignPattern.Context;

import Behavioural_DesignPattern.Strategy_DesignPattern.Order;
import Behavioural_DesignPattern.Strategy_DesignPattern.Strategy.OrderPrinter;

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
