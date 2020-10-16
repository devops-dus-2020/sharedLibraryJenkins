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

Verwendung der Map config bei Eingabe muss folgendermassen erfolgen, wenn Map verwendet werden soll:
compile([flag:Paramter]) z.B. compile([s:settings.xml])
!!!!Wichtig Minuszeichen bei der Flag weglassen!!!!

Ansible Service (noch ohne push auf azure.io)
Aktuell muss bei Benutzung von Ansible für den Build von Dockerimages der Name des entsprechenden Yml Files im Jenkinsfile unter Environment angegeben werden - in unserem fall liegen die Yml genau dort, wo auch die pom.xml liegt -> im workspace. Sollten die yml files bei euch in separaten ordnern liegen, dann gebt bitte unter BUILDYML den relativen Pfad (zum Workspace!) ein



