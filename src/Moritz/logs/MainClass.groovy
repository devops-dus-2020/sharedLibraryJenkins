package Moritz.logs

import groovy.util.logging.Log
import java.util.logging.FileHandler
import java.util.logging.SimpleFormatter

@Log
class MainClass
{
   void writefile() {
        String message = 'Das ist ein File mit einer geheimen Nachricht: ich bin so geheim'
        println message
        FileHandler handler = new FileHandler("geheimes.log", true);
        handler.setFormatter(new SimpleFormatter()) 
        log.addHandler(handler)
        log.info(message)
    }
}