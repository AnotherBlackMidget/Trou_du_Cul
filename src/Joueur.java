import java.util.ArrayList;

public class Joueur
{
    int points;
    ARole role;
    int rolePriority;

    String nom;

    Joueur()
    {
        //cin nom
        rolePriority = 0;
    }

    void SetPosition(int rP, ARole r)
    {
        role = r;
        rolePriority = rP;
    }



}
