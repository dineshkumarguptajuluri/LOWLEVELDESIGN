public class Logger {
    public static int  INFO =1;
    public static int  DEBUG =2;
    public static int  ERROR =3;
    public Logger nextLogger;
    public Logger(Logger nextLogger)
    {
        this.nextLogger = nextLogger;
    }
     public void log(int logLevel,String message)
     {
         if(nextLogger!=null)
         {
             nextLogger.log(logLevel,message);
         }
         else{
             System.out.println("Suitable Logger Not Found");
         }
     }

}