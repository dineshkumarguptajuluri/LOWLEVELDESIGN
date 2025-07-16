public class ErrorLogger extends Logger{
    public ErrorLogger(Logger obj)
    {
        super(obj);
    }
    public void log(int loglevel,String message)
    {
        if(loglevel==ERROR)
        {
            System.out.println("Message is "+message+" Reagrding Error");
        }
        else
            super.log(loglevel,message);
    }
}