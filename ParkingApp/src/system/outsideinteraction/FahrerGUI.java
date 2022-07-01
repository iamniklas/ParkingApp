package system.outsideinteraction;

public class FahrerGUI extends GUInterface implements SchnittstelleZumFahrer {

	private static final long serialVersionUID = 1L;
	
	private SchnittstelleVomFahrer parkingApp;
	
	public FahrerGUI(SchnittstelleVomFahrer parkingApp) {
		super("Fahrer");
		this.parkingApp = parkingApp;
		addActorAction("Dreck");
	}
	
	@Override
	void actorActionTriggered(String actorAction) {
		readString("Dreck?");
		// TODO Auto-generated method stub

	}

}
