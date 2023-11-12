package tn.esprit.ms.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ms.DAO.Entities.Produit;
import tn.esprit.ms.DAO.Repository.ProduitRepository;
import java.util.List;

@Service
public class ProduitService implements IProduitService {
    private ProduitRepository produitRepository;

    @Autowired
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Produit findById(String id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);

    }

    @Override
    public Produit editProduit(Produit produit) {
        return produitRepository.save(produit);
    }
    @Override
    public void deleteProduit(String id) {
        produitRepository.deleteById(id);
    }
}
