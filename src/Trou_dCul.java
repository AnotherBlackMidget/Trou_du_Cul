public class Trou_dCul extends ARole
{
    void RoleFunctions()
    {

    }

    void DonneCartes()
    {
        Carte tempCard;

        for(int x=0; x<2; x++)
        {
            tempCard = main.get(main.size() - 1);
            transitCards.add(tempCard);
            main.remove(tempCard);
        }

    }
}
