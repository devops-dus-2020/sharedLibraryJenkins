import hudson.model.*
import andreas.*


def log(variable) {
    echo "${variable}"


    //String output = "${variable}"
    println "In vars/testlogger"

    String output = 'Logging works!'

    def bindingout = getBinding().out
    JenkinsLogger logger = new JenkinsLogger(bindingout)
    logger.print(output)
    logger.prinln(output)
}
