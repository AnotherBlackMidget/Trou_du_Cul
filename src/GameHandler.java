import java.util.*;

public class GameHandler
{
    int playerCount;
    ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    Deck deck;


    void NewDeck()
    {
        deck = new Deck();
        deck.Shuffle();
    }

    void SelectPlayers()
    {
        Joueur tempJoueur;
        //cin playerCount
        for(int i=0; i<playerCount; i++)
        {
            tempJoueur = new Joueur();
            joueurs.add(tempJoueur);
        }
    }

    void FirstPick()
    {
        int i = 0;
        Carte tempCarte;

        for(Joueur j : joueurs)
        {
            tempCarte = deck.cartes.get(0);
            deck.cartes.remove(0);

            j.points = tempCarte.points;
            System.out.println(j.nom + ": " + tempCarte.valeur + " " + tempCarte.couleur);
        }



    }
}
