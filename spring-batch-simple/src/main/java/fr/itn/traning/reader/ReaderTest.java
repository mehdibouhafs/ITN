package fr.itn.traning.reader;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import fr.itn.traning.model.Encandrant;

public class ReaderTest implements ItemReader<Encandrant> {

	private List<Encandrant> encadrants = new ArrayList<Encandrant>();
	private int index = 0;

	public ReaderTest() {
		Encandrant encadrantEntreprise = new Encandrant(1L,"Monsieur Mouaouia",26,null);
		Encandrant encadrantUniversite = new Encandrant(2L,"Monsieur Mourlin",55,null);
		
		encadrants.add(encadrantEntreprise);
		encadrants.add(encadrantUniversite);
	}

	@Override
	public Encandrant read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if (index < encadrants.size()) {
			int i = index;
			System.out.println("Readed :" + encadrants.get(i++));
			return encadrants.get(index++);
		}
		else {
			return null;
		}
		
	}

}
