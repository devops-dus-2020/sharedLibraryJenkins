package andreas

class JenkinsLogger {
    Closure out = {String msg -> println msg}

    // Constructor
//    JenkinsLogger(Closure closure) {
//        out = closure
//    }
    
    void println(String output) {
        out(output)
    }
}
