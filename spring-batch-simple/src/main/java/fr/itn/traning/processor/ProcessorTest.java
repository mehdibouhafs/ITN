package fr.itn.traning.processor;

import org.springframework.batch.item.ItemProcessor;

import fr.itn.traning.model.Campany;
import fr.itn.traning.model.Encandrant;

public class ProcessorTest implements ItemProcessor<Encandrant,Encandrant> {

	@Override
	public Encandrant process(Encandrant encadrant) throws Exception {
		if(encadrant.getName().equals("Monsieur Mouaouia")){
			encadrant.setCampany(new Campany("ITN"));
		}
		else 
			encadrant.setCampany(new Campany("ESIAG-MIAGE"));
		return encadrant;
	}


	

}
