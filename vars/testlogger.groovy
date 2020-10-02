import andreas.*


def log(variable) {
    String output = "${variable}"

    // Initiate JenkinsLogger
    JenkinsLogger logger = new JenkinsLogger({String msg -> println msg})

    // Print to Jenkins console
    logger.println(output)
}
