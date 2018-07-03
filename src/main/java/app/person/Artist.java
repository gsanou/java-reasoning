package app.person;

import java.util.ArrayList;
import java.util.List;

import app.thing.ArtWork;

public class Artist extends Person {
	
	private List<ArtWork> crafts = new ArrayList<>();
	
	public void crafts(ArtWork artwork) {
		crafts.add(artwork);
	}

	public List<ArtWork> getCrafts() {
		return crafts;
	}

}