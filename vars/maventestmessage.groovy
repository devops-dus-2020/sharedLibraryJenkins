import connection.*
import core.*


def testmessage() {
    ConnectionMavenCompile connect = new ConnectionMavenCompile()
    CoreMavenCompile cmp = new CoreMavenCompile(connect)

    String success = cmp.compileMessage()
    //return success
    echo success
}

//println mavenCompile()