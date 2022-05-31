package observer;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect {
	
	List<Observer> observers=new ArrayList<>();
	String anunt;
	
	public Autobuz(String anunt) {
		this.observers=observers;
		this.anunt=anunt;
	}
	

	@Override
	public void adaugaObserver(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void elminaObserver(Observer obs) {
		observers.remove(obs);
		
	}

	@Override
	public void anuntaCalator() {
		for(Observer obs:observers) {
			obs.primesteAnunt(anunt);
		}
		
	}
	
	

}
