package Decorator;

import Observer.Room;

// Upgrade decorator
// It extends Room to be interchangeable with its toppings decorator
// Can also be implemented as an interface

public class Upgrades extends Room{

   
	public abstract String getDescription();

}
