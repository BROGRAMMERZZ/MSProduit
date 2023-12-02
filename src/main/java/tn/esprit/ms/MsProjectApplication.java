package tn.esprit.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tn.esprit.ms.DAO.Entities.Produit;
import tn.esprit.ms.DAO.Repository.CategorieRepository;
import tn.esprit.ms.DAO.Repository.ProduitRepository;
@EnableEurekaClient
@SpringBootApplication
public class MsProjectApplication implements CommandLineRunner {
    @Autowired
    private  ProduitRepository produitRepository;
    private  CategorieRepository categorieRepository;

   /* public MsProjectApplication(ProduitRepository produitRepository,CategorieRepository categorieRepository){
        this.produitRepository=produitRepository;
        this.categorieRepository=categorieRepository;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(MsProjectApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        if(produitRepository.findAll().isEmpty()){
            produitRepository.save(new Produit("P","description",800,""));
        }
        for(Produit produit : produitRepository.findAll()){
            System.out.println(produit);
        }
    }*/
    @Override
    public void run(String... args) throws Exception {
        // La méthode run est désormais vide
    }
}
