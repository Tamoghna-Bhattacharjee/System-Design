package Behavioural_DesignPattern.Strateg.Strategy;

import Behavioural_DesignPattern.Strateg.Order;

import java.util.Collection;

public interface OrderPrinter {
    public void print(Collection<Order> orders);
}
