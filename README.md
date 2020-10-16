# sharedLibraryJenkins

by BBROW

## @Field annotation
legt Variablen für das gesamte File fest.
Warum haben wir dies getan?
=> Ansonsten muesste man diese für jede Methode wiederholend aufrufen. (Doppelter Code)

## @Log
Logger
Der Logger lenkt den Outputstream auf den Jenkins-Outputstream um.

## Artifactpackage
Funktion zum aufrufen von "maven clean package", musste als "Artifactpackage" benannt werden, weil
groovy eine eigene package() Funktion besitzt.

## config map
**Achtung:** Die Implementierung hat sich geändert und ist nicht downward kompatibel.
Die config map kann benutzt werden, um beliebige Werte von Jenkins an die groovy Methoden weiterzureichen. Eine Map besteht immer aus einer Liste von Key-Value Paaren. `[key1: value1, key2: value2]`
Weitere Argumente und Optionen, die an Maven weitergereicht werden sollen, müssen mit dem key `mvn_args` als String übergeben werden. In `mvn.groovy` wird config Map bereits bereits mit dem korrekten Workspace für Maven initialisiert, d.h. `config = [mvn_args: "-f ${WORKSPACE}]`, wobei `WORKSPACE` eine Umgebungsvariable ist, die von Jenkins automatisch auf den korrekten Pfad gesetzt wird.
Weitere Optionen können an diesen String angehängt werden, z.B. `config.mvn_args += " --settings mysettings.xml"`. *Bitte Leerzeichen am Anfang nicht vergessen!*

## Ansible Service (noch ohne push auf azure.io)
Aktuell muss bei Benutzung von Ansible für den Build von Dockerimages der Name des entsprechenden Yml Files im Jenkinsfile unter Environment angegeben werden - in unserem fall liegen die Yml genau dort, wo auch die pom.xml liegt -> im workspace. Sollten die yml files bei euch in separaten ordnern liegen, dann gebt bitte unter BUILDYML den relativen Pfad (zum Workspace!) ein
