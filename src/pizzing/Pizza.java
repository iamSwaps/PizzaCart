package pizzing;

public class Pizza {
	private double cost;
	private String name;
	private int offer;
	
	public Pizza() {
		setName(name);
		setCost(cost);
		setOffer(offer);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCost(double cost) {
		this.cost=cost;
	}
	
	public void setOffer(int offer) {
		this.offer=offer;
	}
	
	public double getCost()				
	{
		return cost;				
	}
	
	public String getName()				
	{
		return name;				
	}
	
	public int getOffer()				
	{
		return offer;				
	}
}
