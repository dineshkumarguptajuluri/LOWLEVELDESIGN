import  java.util.*;

public class RemoteController {
    Stack<Icommand> stack;
    Icommand command;
    public  RemoteController()
    {
        stack = new Stack<>();
    }
    public void setCommand(Icommand command)
    {
        this.command = command;
    }
    public void pressButton()
    {
        command.execute();
        stack.add(command);
    }
    public void undo()
    {
        if(!stack.isEmpty())
        {
            Icommand commandUsed = stack.pop();
            commandUsed.undo();
        }

    }

}