package model;

public enum Airlines {

	QATAR("Qatar Airways"), 
	AVIANCA("Avianca"), 
	COPA("Copa Airlines"), 
	EMIRATES("Emirates"), 
	LUFT("Lufthansa"), 
	VIVA("Viva Colombia"), 
	IBERIA("Iberia"), 
	LATAM("Latam");
	
	private String name;
	
	private Airlines(String n) {
		this.name = n;
	}
	
	public int getValue() {
		return Airlines.values().length;
	}
	
	public String getName() {
		return name;
	}
	
}
