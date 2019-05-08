package model;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Airport {
	
	private Flight first;
	private int sizeOfTheList;
	
	public Airport() {
		this.first = first;
	}
	
	public String getRandomAirline() {
		String este = "";
		Random rnd = new Random();
		int value = rnd.nextInt(8);
		for (int i = 0; i < Airlines.values().length; i++) {
			if(value == i) {
				este = Airlines.values()[i].name();
			}
		}
		return este;
	}
	
	public String getRandomDestiny() {
		String este = "";
		Random rnd = new Random();
		int value = rnd.nextInt(8);
		for (int i = 0; i < Destinies.values().length; i++) {
			if(value == i) {
				este = Destinies.values()[i].getName();
			}
		}
		return este;
	}
	
	public String randomChar() {
		char este = 'a';
		String todo =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		este = todo.charAt(rnd.nextInt(26));
		todo = ""+este;
		return todo;
	}
	
	public String getRandomCode() {
		String este = "";
		Random rnd = new Random();
		este = randomChar();
		int num = rnd.nextInt(999);
		if(num<99) {
			este += "0"+ num;
		}else if(num<9) {
			este += "00"+num;		
		}else {
			este += num;
		}
		
		return este;
	}
	
	public Date getRandomDate() {
		Random rnd = new Random();
		int days = rnd.nextInt();
		Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR, days);
	
		return date.getTime();
	}
	

	public int getSize() {
		return sizeOfTheList;
	}

	public void sortByDate() { 
		
		if (first.getNext() != null && first.getDate().compareTo(first.getNext().getDate()) > 0) {
			Flight temp = first;
			first = first.getNext();
			temp.setNext(first.getNext());
			first.getNext().setPrevious(temp);
			first.setNext(temp);
			temp.setPrevious(first);
			first.setPrevious(null);
		}
		
		Flight current = first.getNext();
		Flight temp;
		
		while(current.getNext() != null) {
			
			while(current.getNext() != null && current.getDate().compareTo(current.getNext().getDate()) > 0) {
				
				temp = current.getNext();
				
				if (temp.getNext() != null) {
					temp.getNext().setPrevious(current);
					current.setNext(temp.getNext());
				}else {
					current.setNext(null);
				}
		
				current.getPrevious().setNext(temp);
				temp.setPrevious(current.getPrevious());
				current.setPrevious(temp);
				temp.setNext(current);
						
			}
			
			if (current.getNext() != null && current.getDate().compareTo(current.getNext().getDate()) <= 0) {
				current = current.getNext();
			}
			
			
		}	
	}
	
	
	
	public void sortByGate() { 
		
		if (first.getNext() != null && first.getGate().compareTo(first.getNext().getGate()) > 0) {
			Flight temp = first;
			first = first.getNext();
			temp.setNext(first.getNext());
			first.getNext().setPrevious(temp);
			first.setNext(temp);
			temp.setPrevious(first);
			first.setPrevious(null);
		}
		
		Flight current = first.getNext();
		Flight temp;
		
		while(current.getNext() != null) {
			
			while(current.getNext() != null && current.getGate().compareTo(current.getNext().getGate()) > 0) {
				
				temp = current.getNext();
				
				if (temp.getNext() != null) {
					temp.getNext().setPrevious(current);
					current.setNext(temp.getNext());
				}else {
					current.setNext(null);
				}
		
				current.getPrevious().setNext(temp);
				temp.setPrevious(current.getPrevious());
				current.setPrevious(temp);
				temp.setNext(current);
						
			}
			
			if (current.getNext() != null && current.getGate().compareTo(current.getNext().getGate()) <= 0)  {
				current = current.getNext();
			}
			

			
		}	
	}
	

	
	public void sortByAirLine() {
		
		if (first.getNext() != null && first.getAirline().compareTo(first.getNext().getAirline()) > 0) {
			Flight temp = first;
			first = first.getNext();
			temp.setNext(first.getNext());
			first.getNext().setPrevious(temp);
			first.setNext(temp);
			temp.setPrevious(first);
			first.setPrevious(null);
		}
		
		Flight current = first.getNext();
		Flight temp;
		
		while(current.getNext() != null) {
			
			while(current.getNext() != null && current.getAirline().compareTo(current.getNext().getAirline()) > 0) {
				
				temp = current.getNext();
				
				if (temp.getNext() != null) {
					temp.getNext().setPrevious(current);
					current.setNext(temp.getNext());
				}else {
					current.setNext(null);
				}
		
				current.getPrevious().setNext(temp);
				temp.setPrevious(current.getPrevious());
				current.setPrevious(temp);
				temp.setNext(current);
						
			}
			
			if (current.getNext() != null && current.getAirline().compareTo(current.getNext().getAirline()) <= 0) {
				current = current.getNext();
			}
			
			
		}	
		
	}

	
	public void sortByFlightNumber() {
		
		if (first.getNext() != null && first.getNumFlight().compareTo(first.getNext().getNumFlight()) > 0) {
			Flight temp = first;
			first = first.getNext();
			temp.setNext(first.getNext());
			first.getNext().setPrevious(temp);
			first.setNext(temp);
			temp.setPrevious(first);
			first.setPrevious(null);
		}
		
		Flight current = first.getNext();
		Flight temp;
		
		while(current.getNext() != null) {
			
			while(current.getNext() != null && current.getNumFlight().compareTo(current.getNext().getNumFlight()) > 0) {
				
				temp = current.getNext();
				
				if (temp.getNext() != null) {
					temp.getNext().setPrevious(current);
					current.setNext(temp.getNext());
				}else {
					current.setNext(null);
				}
		
				current.getPrevious().setNext(temp);
				temp.setPrevious(current.getPrevious());
				current.setPrevious(temp);
				temp.setNext(current);
						
			}
			
			if (current.getNext() != null && current.getNumFlight().compareTo(current.getNext().getNumFlight()) <= 0) {
				current = current.getNext();
			}
			
			
		}	
		
	}
	

	
	public void sortByDestiny() {
		
		if (first.getNext() != null && first.getDestiny().compareTo(first.getNext().getDestiny()) > 0) {
			Flight temp = first;
			first = first.getNext();
			temp.setNext(first.getNext());
			first.getNext().setPrevious(temp);
			first.setNext(temp);
			temp.setPrevious(first);
			first.setPrevious(null);
		}
		
		Flight current = first.getNext();
		Flight temp;
		
		while(current.getNext() != null) {
			
			while(current.getNext() != null && current.getDestiny().compareTo(current.getNext().getDestiny()) > 0) {
				
				temp = current.getNext();
				
				if (temp.getNext() != null) {
					temp.getNext().setPrevious(current);
					current.setNext(temp.getNext());
				}else {
					current.setNext(null);
				}
		
				current.getPrevious().setNext(temp);
				temp.setPrevious(current.getPrevious());
				current.setPrevious(temp);
				temp.setNext(current);
						
			}
			
			if (current.getNext() != null && current.getDestiny().compareTo(current.getNext().getDestiny()) <= 0) {
				current = current.getNext();
			}
			
			
		}	
	}
	

}
