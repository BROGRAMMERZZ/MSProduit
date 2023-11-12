package tn.esprit.ms.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ms.DAO.Entities.Categorie;
import tn.esprit.ms.DAO.Repository.CategorieRepository;
import tn.esprit.ms.DAO.Repository.ProduitRepository;

import java.util.List;
@Service
public class CategorieService implements ICategorieService {
    private CategorieRepository categorieRepository;

    @Autowired
    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }
    @Override
    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie findByIdC(String id) {
        return categorieRepository.findById(id).orElse(null);
    }

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie editCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);    }

    @Override
    public void deleteCategorie(String id) {
        categorieRepository.deleteById(id);
    }
}
