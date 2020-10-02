package andreas

JenkinsLogger implements InterfaceJenkinsLogger {
    def out

    // Constructor
    JenkinsLogger(def bindingout) {
        this.out = bindingout
    }
    
    void print(String output) {
        out.print(output)
    }

    void println(String output) {
        out.println(output)
    }
}
