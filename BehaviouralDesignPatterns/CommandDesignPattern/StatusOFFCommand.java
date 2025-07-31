public class StatusOFFCommand implements Icommand{
    Remote obj;
    public StatusOFFCommand(Remote obj)
    {
        this.obj = obj;
    }
    public void execute()
    {
        obj.turnOff();
    }
    public void undo()
    {
        obj.turnOn();
    }
}