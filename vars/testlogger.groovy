import andreas.*


def log(variable) {
    echo "${variable}"


    //String output = "${variable}"
    println "In vars/testlogger"

    String output = 'Logging works!'

    Closure myecho = {String msg -> print msg}
    //myGreeting.redirectEcho("redirected", myecho)

    //JenkinsLogger logger = new JenkinsLogger(myecho)
    JenkinsLogger logger = new JenkinsLogger()
    logger.println(output)
}
