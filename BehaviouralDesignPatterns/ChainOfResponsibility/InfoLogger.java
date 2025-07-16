public class InfoLogger extends Logger{
    public InfoLogger(Logger obj)
    {
        super(obj);
    }
    public void log(int loglevel,String message)
    {
        if(loglevel==INFO)
        {
            System.out.println("Message is "+message+" Reagrding Info");
        }
        else
            super.log(loglevel,message);
    }
}