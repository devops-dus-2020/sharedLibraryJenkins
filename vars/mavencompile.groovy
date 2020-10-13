import connection.*
import core.*

def compile() {
    ConnectionMavenCompile connect = new ConnectionMavenCompile()
    CoreMavenCompile cmp = new CoreMavenCompile(connect)

    cmp.mavenCompile()
}