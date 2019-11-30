public class Concierge extends ARole
{
    void RoleFunctions()
    {

    }

    void DonneCartes()
    {
        Carte tempCard;

        tempCard = main.get(main.size() - 1);
        transitCards.add(tempCard);
        main.remove(tempCard);
    }
}
