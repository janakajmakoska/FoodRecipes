package com.example.foodrecipes;


public class Food {
    private int id;
    private String name;
    private String recipes;
//    private byte[] image;

    public Food(String name, String recipes, int id) {
        this.name = name;
        this.recipes = recipes;
//        this.image = image;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipes() {
        return recipes;
    }

    public void setRecipes(String recipes) {
        this.recipes = recipes;
    }

//    public byte[] getImage() {
//        return image;
//    }
//
//    public void setImage(byte[] image) {
//        this.image = image;
//    }
}
