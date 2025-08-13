import java.util.*;

public class PersonCareTaker
{
    List<PersonMemento> history;
    public PersonCareTaker()
    {
        history = new ArrayList<>();
    }

    public void addMemento(PersonMemento snapShot)
    {
        history.add(snapShot);
        System.out.println("Snap Shot Added To List");
    }

    public PersonMemento undo()
    {
        if(history.size()==0)
            return null;
        PersonMemento last = history.get(history.size()-1);
        history.remove(history.size()-1);
        return last;
    }

}