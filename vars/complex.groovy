import ralf.*


def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
    MyVersion uut = new MyVersion(new VersionService())
    echo uut.getVersion()
}