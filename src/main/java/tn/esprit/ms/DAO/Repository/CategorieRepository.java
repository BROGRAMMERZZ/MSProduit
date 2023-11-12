package tn.esprit.ms.DAO.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.ms.DAO.Entities.Categorie;
import tn.esprit.ms.DAO.Entities.Produit;

public interface CategorieRepository extends MongoRepository<Categorie,String> {
}
