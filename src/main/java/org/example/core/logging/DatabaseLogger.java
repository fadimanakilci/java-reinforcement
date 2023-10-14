package org.example.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String log) {
        System.out.println("Veritabanına loglandı. log = " + log);
    }
}
