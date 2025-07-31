public class StatusONCommand implements Icommand{
    Remote obj;
    public StatusONCommand(Remote obj)
    {
        this.obj = obj;
    }
    public void execute()
    {
        obj.turnOn();
    }
    public void undo()
    {
        obj.turnOff();
    }
}