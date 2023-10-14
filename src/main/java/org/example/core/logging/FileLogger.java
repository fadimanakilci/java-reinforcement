package org.example.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String log) {
        System.out.println("Dosyaya loglandı. log = " + log);
    }
}
