package optional;

import java.util.function.Supplier;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class Logger {
    private boolean isDebug = false;

    public boolean isDebug() {
        return isDebug;
    }

    public void setDebug(boolean debug) {
        isDebug = debug;
    }

    public void debug(Object message){
        if(isDebug){
            System.out.println(message);
        }
    }


    public void debug(Supplier<?> supplier){
        if(isDebug){
            System.out.println(supplier.get());
        }
    }

}
