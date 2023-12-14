package Behavioural_DesignPattern.State_Pattern.States;

import Behavioural_DesignPattern.State_Pattern.States.OrderState;

//Concrete state
public class Cancelled implements OrderState {

	@Override
	public double handleCancellation() {
		throw new IllegalStateException("Cancelled order. Can't cancel anymore");
	}

}
