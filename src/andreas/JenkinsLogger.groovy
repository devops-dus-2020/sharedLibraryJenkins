package andreas

class JenkinsLogger {
    Closure out

    // Constructor
    JenkinsLogger(Closure closure) {
        out = closure
    }
    
    void println(String output) {
        out(output)
    }
}
