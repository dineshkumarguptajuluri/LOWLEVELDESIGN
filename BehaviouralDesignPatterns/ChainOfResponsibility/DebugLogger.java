public class DebugLogger extends Logger{
    public DebugLogger(Logger obj)
    {
        super(obj);
    }
    public void log(int loglevel,String message)
    {
        if(loglevel==DEBUG)
        {
            System.out.println("Message is "+message+" Reagrding Debug");
        }
        else
            super.log(loglevel,message);
    }
}