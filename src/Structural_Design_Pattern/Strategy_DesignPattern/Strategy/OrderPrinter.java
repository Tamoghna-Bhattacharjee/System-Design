package Structural_Design_Pattern.Strategy_DesignPattern.Strategy;

import Structural_Design_Pattern.Strategy_DesignPattern.Order;

import java.util.Collection;

public interface OrderPrinter {
    public void print(Collection<Order> orders);
}
