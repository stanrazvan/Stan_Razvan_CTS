package mijlocTransport;

public class Tramvai extends MijlocTransport {

	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
		
	}

	@Override
	public void afisareNrInmatriculare() {
		System.out.println("Tramvaiul are nr de inmatriculare: ");
		System.out.println(super.getNrInmatriculare());
	}

	
}
