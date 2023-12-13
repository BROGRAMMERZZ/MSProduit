package tn.esprit.ms.Services;

import tn.esprit.ms.DAO.Entities.Produit;

import java.util.List;

public interface IProduitService {

    List<Produit> getAllProduit();
    Produit findById(String id);
    Produit addProduit(Produit produit);
    Produit editProduit(Produit produit);
    void deleteProduit(String id);

}
