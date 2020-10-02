//TODO import statements
import maik.devopsdusmaik.*
import maik.core.*


def warning() {
    def s = new EchoService()
    Echo uut = new Echo(s)
    echo uut.Name()
}