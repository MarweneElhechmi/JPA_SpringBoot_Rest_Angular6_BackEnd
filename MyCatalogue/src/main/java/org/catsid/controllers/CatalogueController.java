package org.catsid.controllers;

import java.util.List;

import org.catsid.dao.ProduitRepository;
import org.catsid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlleur accessible via une Servlet
// Spring MVC déploie dispatcher Servlet
// Spring MVC on l'a utilisé comme un RestController , li ne génére pas des JSP ou des pages HTML 
// mais il génére un résultat en format JSON

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
	
	@RequestMapping(value="/produits")
	public Page<Produit> getProduitPage(int page) {
		return produitRepository.findAll(new PageRequest(page, 5));
		
	}
	
	// "%"+motCle+"%": c'est-à-dire quelque soit caractére avant ou aprés 
	@RequestMapping(value="/produitsParMotCle")
	public Page<Produit> getProduitMotCle(String motCle,int page) {
		return produitRepository.ProduitParMotCle("%"+motCle+"%",new PageRequest(page, 5));
		
	}
	
}
