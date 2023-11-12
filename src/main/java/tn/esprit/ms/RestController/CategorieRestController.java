package tn.esprit.ms.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ms.DAO.Entities.Categorie;
import tn.esprit.ms.DAO.Entities.Produit;
import tn.esprit.ms.Services.ICategorieService;
import tn.esprit.ms.Services.IProduitService;

import java.util.List;
@RestController
@RequestMapping("/categories")
public class CategorieRestController {
    private ICategorieService categorieService;

    @Autowired
    public CategorieRestController(ICategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Categorie>> getAllCategories() {
        List<Categorie> categories = categorieService.getAllCategorie();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Categorie> getCategorieById(@PathVariable String id) {
        Categorie categorie = categorieService.findByIdC(id);
        if (categorie != null) {
            return new ResponseEntity<>(categorie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addCategorie")
    public ResponseEntity<Categorie> addCategorie(@RequestBody Categorie categorie) {
        Categorie newCategorie = categorieService.addCategorie(categorie);
        return new ResponseEntity<>(newCategorie, HttpStatus.CREATED);
    }

    @PutMapping("/editCategorie/{id}")
    public ResponseEntity<Categorie> editCategorie(@PathVariable String id, @RequestBody Categorie updatedCategorie) {
        Categorie existingCategorie = categorieService.findByIdC(id);

        if (existingCategorie != null) {
            updatedCategorie.setId(id);
            Categorie savedCategorie = categorieService.editCategorie(updatedCategorie);
            return new ResponseEntity<>(savedCategorie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Void> deleteCategorie(@PathVariable String id) {
        categorieService.deleteCategorie(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
