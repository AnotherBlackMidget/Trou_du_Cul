import java.util.*;

public class Deck
{
    ArrayList<Carte> cartes;
    Carte tempCarte;

    Deck()
    {
        cartes = new ArrayList<Carte>();
        for(int i=0; i<52; i++)
        {
            tempCarte = new Carte();

            if(i/4 == 0) tempCarte.valeur = "3";
            else if(i/4 == 1) tempCarte.valeur = "4";
            else if(i/4 == 2) tempCarte.valeur = "5";
            else if(i/4 == 3) tempCarte.valeur = "6";
            else if(i/4 == 4) tempCarte.valeur = "7";
            else if(i/4 == 5) tempCarte.valeur = "8";
            else if(i/4 == 6) tempCarte.valeur = "9";
            else if(i/4 == 7) tempCarte.valeur = "10";
            else if(i/4 == 8) tempCarte.valeur = "Valet";
            else if(i/4 == 9) tempCarte.valeur = "Dame";
            else if(i/4 == 10) tempCarte.valeur = "Roi";
            else if(i/4 == 11) tempCarte.valeur = "As";
            else if(i/4 == 12) tempCarte.valeur = "2";

            if(i%4==0) tempCarte.couleur = "de Carreau";
            else if(i%4==1) tempCarte.couleur = "de Trefle";
            else if(i%4==2) tempCarte.couleur = "de Coeur";
            else if(i%4==3) tempCarte.couleur = "de Pique";

            tempCarte.points = i/4;
            cartes.add(tempCarte);
        }
        tempCarte = new Carte();
        tempCarte.valeur = "Joker";
        tempCarte.couleur = "Noir";
        tempCarte.points = 13;
        cartes.add(tempCarte);

        tempCarte = new Carte();
        tempCarte.valeur = "Joker";
        tempCarte.couleur = "de Couleur";
        tempCarte.points = 14;
        cartes.add(tempCarte);
    }

    void Shuffle()
    {
        Collections.shuffle(cartes);
    }
}
