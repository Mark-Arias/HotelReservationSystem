package Decorator;

import Observer.Room;

// Upgrade decorator
// It extends Room to be interchangeable with its toppings decorator
// Can also be implemented as an interface

public abstract class Upgrades extends Room{

   
	public abstract String getDescription();

}
