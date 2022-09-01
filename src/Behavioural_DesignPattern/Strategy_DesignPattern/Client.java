package Behavioural_DesignPattern.Strategy_DesignPattern;

import Behavioural_DesignPattern.Strategy_DesignPattern.ConcreteStrategy.DetailPrinter;
import Behavioural_DesignPattern.Strategy_DesignPattern.ConcreteStrategy.SummaryPrinter;
import Behavioural_DesignPattern.Strategy_DesignPattern.Context.PrintService;

import java.util.LinkedList;

public class Client {
    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        PrintService service = new PrintService(new SummaryPrinter());
        service.printOrders(orders);
        System.out.println("\n\n\n");
        service = new PrintService(new DetailPrinter());
        service.printOrders(orders);
    }

    private static void createOrders() {
        Order o = new Order("IMX01");
        o.addItem("Soda", 2);
        o.addItem("chips", 10);
        orders.add(o);

        o = new Order("I3L6");
        o.addItem("Cake", 300);
        o.addItem("Cookies", 100);
        orders.add(o);

        o = new Order("S5KHI336");
        o.addItem("Fish", 700);
        o.addItem("Chicken", 200);
        orders.add(o);
    }

}
