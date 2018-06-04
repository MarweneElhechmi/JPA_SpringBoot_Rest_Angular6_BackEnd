package org.catsid;

import org.catsid.dao.PaysRepository;
import org.catsid.dao.ProduitRepository;
import org.catsid.entities.Pays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyCatalogueApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyCatalogueApplication.class, args);
		PaysRepository pa = ctx.getBean(PaysRepository.class);
		
		pa.save(new Pays((long) 1,"France","Nice"));
	}
}
