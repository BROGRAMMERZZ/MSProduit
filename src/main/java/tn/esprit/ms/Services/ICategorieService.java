package tn.esprit.ms.Services;

import tn.esprit.ms.DAO.Entities.Categorie;
import tn.esprit.ms.DAO.Entities.Produit;

import java.util.List;

public interface ICategorieService {
    List<Categorie> getAllCategorie();
    Categorie findByIdC(String id);
    Categorie addCategorie(Categorie categorie);
    Categorie editCategorie(Categorie categorie);
    void deleteCategorie(String id);
}
