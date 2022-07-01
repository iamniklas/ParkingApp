package system;

import java.util.Random;

import com.github.javafaker.Faker;

public class Parkplatz {
	public String besitzer;
	public long id;
	public int distanz;
	public boolean verfuegbar;
	public String addresse; 
	
	public static Parkplatz getParkplatz() {
		Parkplatz p = new Parkplatz();
		Faker f = new Faker();
		p.besitzer = f.name().firstName() + " " + f.name().lastName();
		p.id = System.currentTimeMillis();
		p.distanz = new Random().nextInt(100-3)+3;
		p.verfuegbar = f.random().nextBoolean();
		p.addresse = f.address().streetName() + " " + f.address().buildingNumber() + " " + f.address().cityName();
		
		return p;
	}
	
	public double getDistanz() {
		return distanz;
	}
	public long getId() {
		return id;
	}
	public String getBesitzer() {
		return besitzer;
	}
	public boolean getVerfuegbar() {
		return verfuegbar;
	}
	
	@Override
	public String toString() {
		return addresse + " - Distanz: " + distanz + " Meter.";
	}
}
