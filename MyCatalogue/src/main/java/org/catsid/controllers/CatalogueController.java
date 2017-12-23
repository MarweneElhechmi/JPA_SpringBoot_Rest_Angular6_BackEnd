package org.catsid.controllers;

import java.util.List;

import org.catsid.dao.ProduitRepository;
import org.catsid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueController {
	
	@Autowired
	private ProduitRepository produitRepository;

	@RequestMapping(value="/test")
	public String Test() {
		return "test";
	}
	
	@RequestMapping(value="/save")
	public Produit saveProduit(Produit pr) {
		produitRepository.save(pr);
		return pr;
	}
	
	@RequestMapping(value="/all")
	public List<Produit> getProduit() {
		return produitRepository.findAll();
	}
}
