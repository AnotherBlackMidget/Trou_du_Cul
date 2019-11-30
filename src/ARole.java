import java.util.*;

public abstract class ARole
{
    ArrayList<Carte> main;
    ArrayList<Carte> transitCards;

    void TrieMain()
    {

    }


    abstract void RoleFunctions();

    abstract void DonneCartes();

    void RecieveCartes(ArrayList<Carte> tc)
    {
        for(Carte c : tc)
        {
            main.add(c);
        }
    }



}
