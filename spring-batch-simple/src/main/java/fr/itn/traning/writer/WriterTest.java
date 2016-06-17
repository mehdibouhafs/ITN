package fr.itn.traning.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import fr.itn.traning.model.Encandrant;

public class WriterTest implements ItemWriter<Encandrant> {

	@Override
	public void write(List<? extends Encandrant> data) throws Exception {

		System.out.println("Writed :" + data);

		for (Encandrant encandrant : data) {
			System.out.println(encandrant);
		}

	}

}
