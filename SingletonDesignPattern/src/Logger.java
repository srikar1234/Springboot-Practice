import java.util.Objects;

public class Logger {

    static int counter = 0;
    private static volatile Logger loggerInstance = null;
    //Private constructor disallows user from creating a new object
    private Logger(){
        counter +=1;
        System.out.println("New Logger created. Counter number: " + counter);
    }

    static  Logger getInstanceOfLogger(){
        if(Objects.isNull(loggerInstance)){
            synchronized (Logger.class){
                if(Objects.isNull(loggerInstance))
                    loggerInstance = new Logger();
            }
        }
        return loggerInstance;
    }

    void log(String message){
        System.out.println(message);
    }
}
