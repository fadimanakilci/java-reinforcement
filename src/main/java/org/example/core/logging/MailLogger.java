package org.example.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String log) {
        System.out.println("Maile loglandı. log = " + log);
    }
}
