public class Main {

    public static void main(String[] args) {

        PersonCareTaker careTaker = new PersonCareTaker();
        Person person = new Person("Dinesh",5,8);
        PersonMemento snapshot1 = person.createMemento();
        careTaker.addMemento(snapshot1);
        person.setHeight(6);
        person.setWeight(7);
        PersonMemento snapshot2 = person.createMemento();
        careTaker.addMemento(snapshot2);
        person.setHeight(7);
        person.setWeight(6);
        PersonMemento previous = careTaker.undo();
        person.restoreMemento(previous);
        previous = careTaker.undo();
        person.restoreMemento(previous);





    }
}