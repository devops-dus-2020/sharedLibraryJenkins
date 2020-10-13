import bbrow.*
import groovy.util.logging.*

def maventest(pompath) {
    Closure logger = {String message -> println message}
    UnitTesterService service = new UnitTesterService(logger)
    UnitTester myMavenTest = new UnitTester(service)

    logger(myMavenTest.maventest(pompath))
}