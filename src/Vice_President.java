public class Vice_President extends ARole
{
    void RoleFunctions()
    {

    }

    void DonneCartes()
    {
        Carte tempCard;
        int i = 0;
        int input;

        for(Carte c : main)
        {
            System.out.println(i + ": " + c.valeur + " " + c.couleur);
            i++;
        }

        //cin input
        tempCard = main.get(input);
        transitCards.add(tempCard);
        main.remove(tempCard);
    }
}
