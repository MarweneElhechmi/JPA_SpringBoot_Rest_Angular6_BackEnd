package org.catsid.controllers;

import java.util.List;

import org.catsid.dao.PaysRepository;
import org.catsid.dao.ProduitRepository;
import org.catsid.entities.Pays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PaysController {
	
	@Autowired
	private PaysRepository paysRepository;

	
@RequestMapping(value="/pays")
public Pays saveBalad(@RequestBody Pays pays) {
return paysRepository.save(pays);
}

@RequestMapping(value="/affichePays")
public List<Pays> getPays() {
return paysRepository.findAll();
}
}
