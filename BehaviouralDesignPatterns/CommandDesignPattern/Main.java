public class Main {
    public static void main(String[] args) {

        Remote remote = new Remote();
        RemoteController controller = new RemoteController();
       Icommand command1 = new StatusONCommand(remote);
       controller.setCommand(command1);
       controller.pressButton();
       controller.undo();
       Icommand command2 = new StatusOFFCommand(remote);
       controller.setCommand(command2);
        controller.pressButton();
        controller.undo();









    }
}