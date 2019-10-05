public class Burger {

    long id;
    String name;
    String description;
    int weight;
    double protein;
    double grease;
    double carbohydrate;
    int buns;
    int cheese;
    int chickenCutlet;
    int cucumbers;
    int tomato;
    int beefCutlet;
    int salad;
    int onion;
    boolean sous;
    int price;

    Burger(long id, String name, String description, int weight, double protein, double grease, double carbohydrate,
           int buns, int cheese, int chickenCutlet, int cucumbers, int tomato, int beefCutlet, int salad, int onion,
           boolean sous, int price) {
        this.id = id;
        this.name = name;
        this.description=description;
        this.weight = weight;
        this.protein = protein;
        this.grease = grease;
        this.carbohydrate = carbohydrate;
        this.buns = buns;
        this.cheese = cheese;
        this.chickenCutlet = chickenCutlet;
        this.cucumbers = cucumbers;
        this.tomato = tomato;
        this.beefCutlet = beefCutlet;
        this.salad = salad;
        this.onion = onion;
        this.sous = sous;
        this.price = price;
    }
}
