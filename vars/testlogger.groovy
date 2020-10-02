import andreas.*


def log(variable) {
    echo "${variable}"


    //String output = "${variable}"
    println "In vars/testlogger"

    String output = 'Logging works!'

    def binding = getBinding()
    def bindingvars = binding.getVariables()
    def out = getBinding().out

    println bindingvars

    binding.setProperty("out",new PrintWriter(stdout,true));
    def bindingout = binding.getProperty('out')

    JenkinsLogger logger = new JenkinsLogger(bindingout)
    logger.print(output)
    logger.prinln(output)
}
