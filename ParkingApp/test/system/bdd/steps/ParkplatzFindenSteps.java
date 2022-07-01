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
	@When("Parkplatz {int} ist parkbar")
	public void parkplatz_parkbar(Integer parkId) {
		assertTrue(parkplatzFinden.parkplatzIstFrei(parkId));
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("Parkplatzinformationen von Parkplatz {int} an Navigationssystem übergeben")
	public void parkplatzinformationen_uebergeben(Integer parkId) {
		assertTrue(parkplatzFinden.sendeAnNavigationssystem(parkId));
	}
}
