public class Main {
    public static void main(String[] args) {
        Logger logObj = new Logger(new InfoLogger(new ErrorLogger(new DebugLogger(null))));
        logObj.log(1,"DataNode Info");
        logObj.log(2,"Flow process is not Good");
        logObj.log(3,"Code is Crashing in 3rd Repo");
        logObj.log(4,"Dummy");
    }
}