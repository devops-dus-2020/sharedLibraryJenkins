package rainerC.core
import rainerC.core.JeppieInterface

class Jeppie {

    public JeppieInterface ji

    Jeppie (JeppieInterface ji) {    
        this.ji = ji
    }
    
    public String shoutJeppie(){
        return ji.shout()
     } 
        
}