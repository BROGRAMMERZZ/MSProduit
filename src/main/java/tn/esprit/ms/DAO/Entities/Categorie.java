package tn.esprit.ms.DAO.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "categories")
public class Categorie {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String description;

    public Categorie(){}
    public Categorie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return String.format("Categorie[id='%s',name='%s',description='%s']",id,name,description);

    }

}
