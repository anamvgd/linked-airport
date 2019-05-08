package model;

public enum Destinies {
	

	KOREA("Seoul, Korea"),
	MEXICO("Mexico City, Mexico"),
	FRANCE("Paris, France"),
	ENGLAND("London, UK"),
	SPAIN("Madrid, Spain"), 
	USA("Washington, USA"),
	ARG("Buenos Aires, Argentina"),
	EGIPT("El Cairo, Egipt"),
	ITALY("Rome, Italy");
	
	private String name;
	
	private Destinies(String n) {
		this.name = n;
	}
	
	public int getValue() {
		return Destinies.values().length;
	}
	
	public String getName() {
		return name;
	}

}
