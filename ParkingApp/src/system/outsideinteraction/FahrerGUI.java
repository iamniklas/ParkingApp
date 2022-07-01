package system.outsideinteraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import system.Parkplatz;

public class FahrerGUI extends GUInterface implements SchnittstelleZumFahrer {

	private static final long serialVersionUID = 1L;
	
	private SchnittstelleVomFahrer parkingApp;
	
	private ArrayList<Parkplatz> parkplaetze = new ArrayList<>();
	private List<Parkplatz> parkplaetzeImRadius; 
	
	public FahrerGUI(SchnittstelleVomFahrer parkingApp) {
		super("Fahrer");
		this.parkingApp = parkingApp;
		addActorAction("Parkplatz finden");
		
		for (int i = 0; i < 3000; i++) {			
			parkplaetze.add(Parkplatz.getParkplatz());
		}
	}
	
	@Override
	void actorActionTriggered(String actorAction) {
		switch (actorAction) {
		case "Parkplatz finden":
			double radius = this.readDouble("Radius eingeben:");
			//TODO Fix
			parkplaetzeImRadius = parkplaetze
					.stream()
					.filter(v -> v.verfuegbar)
					.filter(d -> d.getDistanz() < radius)
					.limit(3)
					.collect(Collectors.toList());
			
			if(parkplaetzeImRadius.size() == 0) {
				displayIncomingSystemAction("Keine Parkplätze gefunden. Bitte Radius erweitern oder im nächsten Fluss parken");
				return;
			}
			for (int i = 0; i < 3; i++) {
				if(parkplaetzeImRadius.size() > i)
				displayIncomingSystemAction(parkplaetzeImRadius.get(i).toString());	
			}
			break;

		default:
			break;
		}

	}

}

