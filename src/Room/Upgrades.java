package Room;

public class Upgrades {
	private boolean projector;
	private int towels;
	private int partyFavors;
	private boolean decorations;
	private double cost;

	public Upgrades(boolean projector, int towels, int partyFavors, boolean decorations) {
		this.projector = false;
		this.towels = 0;
		this.partyFavors = 0;
		this.decorations = false;
		this.cost = 0;
	}
	
	public double getCost() {
		this.cost += (towels * 2) + (partyFavors * 5);
		
		if(projector) {
			this.cost += (10); // * reservation.getHours())
		}
		
		if(decorations) {
			this.cost += 100;
		}
		return cost;
	}
	
	public boolean getProjector() {
		return projector;
	}

	public void setProjector(boolean projector) {
		this.projector = projector;
	}

	public int getTowels() {
		return towels;
	}

	public void setTowels(int towels) {
		this.towels = towels;
	}

	public int getPartyFavors() {
		return partyFavors;
	}

	public void setPartyFavors(int partyFavors) {
		this.partyFavors = partyFavors;
	}

	public boolean getDecorations() {
		return decorations;
	}

	public void setDecorations(boolean decorations) {
		this.decorations = false;
	}
}
