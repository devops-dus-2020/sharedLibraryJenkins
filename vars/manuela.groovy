def frage(message) {
    echo "FRAGE: ${message}"
    println 'Nein';
}

def count() {
    def s = new CountService()
    CountKlasse uut = new CountKlasse(s)
    
    echo uut.countFrom1()
}