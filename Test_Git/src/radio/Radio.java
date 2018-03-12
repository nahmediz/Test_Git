package radio;

public class Radio {
	
	private int volume;
	private Chaine_Radio chaine;
	private Chaine_Radio liste_chaines [];
	
	public Radio() {
		
	}
	
	public void augmenter_volume() {
		if (volume<20) {
			volume+=1;
		}
	}
	
	public void diminuer_volume() {
		if (volume>0) {
			volume-=1;
		}
	}

}
