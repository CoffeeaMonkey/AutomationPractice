package Mostenire;

public class Masina {

    // Conceptele de OOP sunt urmatoarele: mostenire, incapsulare, abstractizare si polimorfism.
    // Mostenire - conceptul prin care o clasa mosteneste o alta clasa.
    // In momentul cand se aplica mostenirea, clasa care este mostenita este clasa parinte.
    // Clasa care mosteneste, e clasa copil.
    // Se formeaza relatia de copil - parinte.
    // In Java putem mosteni o singura clasa.
    // Clasa copil trebuie sa apeleze prima data constructorul din clasa parinte.
    // Acest lucru se realizeaza cu cuvantul "super".
    // Incapsulare - conceptul prin care tinem departe de mediul exterior valorile variabilelor.
    // Private - ofera accesul variabilelor doar in interiorul clasei declarate.
    // Ca sa specificam accesul unei variabile de tipul private ne folosim de conceptele get si set.

    private String Marca;
    private String Model;
    private Integer AnulFabricatiei;

    public String getMarca() {
        return Marca;
    }

    public String getModel() {
        return Model;
    }

    public Integer getAnulFabricatiei() {
        return AnulFabricatiei;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setAnulFabricatiei(Integer anulFabricatiei) {
        AnulFabricatiei = anulFabricatiei;
    }

    public Masina(String marca, String model, Integer anulFabricatiei) {
        Marca = marca;
        Model = model;
        AnulFabricatiei = anulFabricatiei;
    }


    public void InfoMasina(){
        System.out.println(" Marca masinii este" +Marca);
        System.out.println("Modelul masinii este" +Model);
        System.out.println("Anul fabricatiei este" +AnulFabricatiei);
    }
}
