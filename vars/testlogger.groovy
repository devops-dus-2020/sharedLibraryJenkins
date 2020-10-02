import andreas.*


def log(variable) {
    echo "${variable}"


    //String output = "${variable}"
    println "In vars/testlogger"

    String output = 'Logging works!'

    // Initiate JenkinsLogger
    JenkinsLogger logger = new JenkinsLogger({String msg -> println msg})

    // Print to Jenkins console
    logger.println(output)
}
