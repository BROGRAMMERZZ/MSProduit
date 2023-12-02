package tn.esprit.ms.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ms.DAO.Entities.Produit;
import tn.esprit.ms.Services.IProduitService;

import java.util.List;

@RestController
@RequestMapping("/produits/ProduitsRest/")
public class ProduitRestController {
    private  IProduitService produitService;

    @Autowired
    public ProduitRestController(IProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Produit>> getAllProduits() {
        List<Produit> produits = produitService.getAllProduit();
        return new ResponseEntity<>(produits, HttpStatus.OK);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Produit> getProduitById(@PathVariable String id) {
        Produit produit = produitService.findById(id);
        if (produit != null) {
            return new ResponseEntity<>(produit, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addProduit")
    public ResponseEntity<Produit> addProduit(@RequestBody Produit produit) {
        Produit newProduit = produitService.addProduit(produit);
        return new ResponseEntity<>(newProduit, HttpStatus.CREATED);
    }

    @PutMapping("/editProduit/{id}")
    public ResponseEntity<Produit> editProduit(@PathVariable String id, @RequestBody Produit produit) {
        produit.setId(id);
        Produit updatedProduit = produitService.editProduit(produit);
        if (updatedProduit != null) {
            return new ResponseEntity<>(updatedProduit, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Void> deleteProduit(@PathVariable String id) {
        produitService.deleteProduit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
