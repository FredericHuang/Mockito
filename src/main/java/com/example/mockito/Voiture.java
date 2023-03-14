package com.example.mockito;

public class Voiture {

    int quantiteEssence = 0;

    public void rouler() {}

    public void voler() throws Exception {
        throw new Exception("Ne peut pas voler");
    }

    public void ajouterEssence(int quantite) throws Exception {
        if(quantite <= 0) throw new Exception("Quantite doit être >= 0");
        quantiteEssence = quantiteEssence + quantite;
    }

    public int getQuantiteEssence() {
        return quantiteEssence;
    }

}
