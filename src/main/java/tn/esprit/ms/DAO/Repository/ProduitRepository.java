package tn.esprit.ms.DAO.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ms.DAO.Entities.Produit;
@Repository
public interface ProduitRepository extends MongoRepository<Produit,String> {
}
