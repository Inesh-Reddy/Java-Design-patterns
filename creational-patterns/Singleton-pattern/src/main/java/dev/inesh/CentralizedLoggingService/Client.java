package dev.inesh.CentralizedLoggingService;

public class Client {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            Logger thread1 = Logger.getInstance();
            System.out.println(thread1.logInfo("log1"));
            Logger thread2 = Logger.getInstance();
            System.out.println(thread2.logInfo("log2"));
            System.out.println(thread2.logError("Error3"));
            Logger thread3 = Logger.getInstance();
            System.out.println(System.identityHashCode(thread3));
            Logger thread4 = Logger.getInstance();
            System.out.println(System.identityHashCode(thread4));

        }
    }
}
