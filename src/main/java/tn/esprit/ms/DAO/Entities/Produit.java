package tn.esprit.ms.DAO.Entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "produits")
public class Produit {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String description;
    @Field
    private double price;

    private String categoryId;


    public Produit(){}
    public Produit(String name, String description, double price, String categoryId) {
        this.name = name;
        this.description = description;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Produit[id='%s', name='%s', description='%s', price='%s', categoryId='%s']", id, name, description, price, categoryId);

    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
