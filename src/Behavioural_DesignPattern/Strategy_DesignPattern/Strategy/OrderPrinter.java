package Behavioural_DesignPattern.Strategy_DesignPattern.Strategy;

import Behavioural_DesignPattern.Strategy_DesignPattern.Order;

import java.util.Collection;

public interface OrderPrinter {
    public void print(Collection<Order> orders);
}
