package system.bdd.steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.ParkplatzFinden;

public class ParkplatzFindenSteps {
	ParkplatzFinden parkplatzFinden = new ParkplatzFinden();
	
	@Given("Parkplatz {int} in Datenbank")
	public void parkplatz_in_datenbank(Integer parkId) {
		assertTrue(parkplatzFinden.parkplatzExistiert(parkId));
	}
	@Given("Parkplatz im angegebenen Radius sind vorhanden")
	public void parkplatz_in_radius() {
		//assertTrue(parkplatzFinden.parkplatzExistiert(parkId));
	}
	@When("Parkplätze im angegebenen Radius sind nutzbar")
	public void parkplatz_in_radius_parkbar(Integer parkId) {
		assertTrue(parkplatzFinden.parkplatzIstFrei(parkId));
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("Parkplatz {int} ist parkbar")
	public void parkplatz_parkbar(Integer parkId) {
		assertTrue(parkplatzFinden.parkplatzIstFrei(parkId));
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("Parkplatzinformationen von Parkplatz {int} an Navigationssystem übergeben")
	public void parkplatzinformationen_uebergeben(Integer parkId) {
		assertTrue(parkplatzFinden.sendeAnNavigationssystem(parkId));
	}
	@Then("Zeige {int} Parkplätze in der GUI an")
	public void parkplatzinformationen_anzeigen(Integer parkId) {
		assertTrue(parkplatzFinden.sendeAnNavigationssystem(parkId));
	}
	
	@When("Kein Parkplatz im Radius {int} gefunden")
	public void kein_parkplatz_in_radius(Integer radius) {
		assertTrue(parkplatzFinden.sendeAnNavigationssystem(0));
	}
	@When("Benutzer möchte in Radius {int} parken")
	public void parken_in_radius(Integer radius) {
		assertTrue(parkplatzFinden.sendeAnNavigationssystem(0));
	}
	@Then("Nutzer bekommt Fehlerbenachrichtigung")
	public void nutzer_benachrichtigen() {
		assertTrue(parkplatzFinden.sendeAnNavigationssystem(0));
	}
}
