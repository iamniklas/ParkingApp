package system;

public class ParkplatzFinden {
	public boolean parkplatzExistiert(int id) {
		return id % 5 == 0;
	}
	
	public boolean parkplatzIstFrei(int id) {
		return true;
	}
	
	public boolean sendeAnNavigationssystem(int id) {
		return true;
	}
}