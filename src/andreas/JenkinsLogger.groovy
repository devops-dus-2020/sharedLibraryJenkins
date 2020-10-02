package andreas

class JenkinsLogger {
    Closure out

    // Constructor
    JenkinsLogger(Closure closure) {
        this.out = closure
    }
    
    void print(String output) {
        out(output)
    }

    void println(String output) {
        out(output + '\n')
    }
}
