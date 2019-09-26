public class Burger {

    long identification;
    String productName;
    String burgerDescription;
    int burgerWeight;
    double burgerProtein;
    double burgerGrease;
    double burgerCarbohydrate;
    int burgerBuns;
    int burgerCheese;
    int burgerChickenCutlet;
    int burgerCucumbers;
    int burgerTomato;
    int burgerBeefCutlet;
    int burgerSalad;
    int burgerOnion;
    boolean burgerSous;
    int burgerPrice;

    Burger(long id, String name, String description, int weight, double protein, double grease, double carbohydrate,
           int buns, int cheese, int chickenCutlet, int cucumbers, int tomato, int beefCutlet, int salad, int onion,
           boolean sous, int price) {
        identification = id;
        productName = name;
        burgerDescription=description;
        burgerWeight = weight;
        burgerProtein = protein;
        burgerGrease = grease;
        burgerCarbohydrate = carbohydrate;
        burgerBuns = buns;
        burgerCheese = cheese;
        burgerChickenCutlet = chickenCutlet;
        burgerCucumbers = cucumbers;
        burgerTomato = tomato;
        burgerBeefCutlet = beefCutlet;
        burgerSalad = salad;
        burgerOnion = onion;
        burgerSous = sous;
        burgerPrice = price;
    }
}
