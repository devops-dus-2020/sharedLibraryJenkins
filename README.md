# sharedLibraryJenkins

by BBROW

@Field annotation
legt Variablen für das gesamte File fest.
Warum haben wir dies getan?
=> Ansonsten muesste man diese für jede Methode wiederholend aufrufen. (Doppelter Code)

@Log
Logger
Der Logger lenkt den Outputstream auf den Jenkins-Outputstream um.


Artifactpackage
Funktion zum aufrufen von "maven clean package", musste als "Artifactpackage" benannt werden, weil
groovy eine eigene package() Funktion besitzt.

Verwendung der Map config bei Eingabe muss folgendermasse erfolgen, wenn Map verwendet werden soll:
compile([flag:Paramter]) z.B. compile([s:settings.xml])
!!!!Wichtig Minuszeichen bei der Flag weglassen!!!!




