package model;

public class RechargeableBattery extends Battery implements Rechargeable{
	public final static char BATTERY_LITIO='l';
	public final static	char BATTERY_NIQUEL_CADIO='n';
	public final static double FACTOR_LITIO=0.92;
	public final static double FACTOR_NIQUEL_CADIO=0.8;
	private int chargerNumber;
	private char type;
	
	public RechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type){
		super(name, voltage, cost, capacity);
		this.chargerNumber=chargerNumber;
		this.type=type;
	}
	
	public double calculateUsefulLifeCost(){
		double factor=0;
		if (type==BATTERY_LITIO){
			factor=FACTOR_LITIO;
		} else if (type==BATTERY_NIQUEL_CADIO){
			factor=FACTOR_NIQUEL_CADIO;
		}
		
		return voltage*cost*capacity/1000*chargerNumber*factor;
	}
	public String toString(){
		return "\nName: "+name+"\nVoltage: "+voltage+"\nCost: "+cost+"\nCapacity: "+capacity+"\nNumber of charges: "+chargerNumber+"Type: "+type;
	}
}