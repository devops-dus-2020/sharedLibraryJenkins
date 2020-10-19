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
**Achtung:** Die Implementierung hat sich geändert und ist nicht abwärtskompatibel.

Die config map kann benutzt werden, um beliebige Werte von Jenkins an die groovy Methoden weiterzureichen. Eine Map besteht immer aus einer Liste von Key-Value Paaren. `[key1: value1, key2: value2]`

Argumente und Optionen, die an Maven weitergereicht werden sollen, müssen mit dem key `mvn_args` als String übergeben werden. In `mvn.groovy` wird die config Map bereits bereits mit dem korrekten Workspace für Maven initialisiert, d.h. `config = [mvn_args: "-f ${WORKSPACE}"]`, wobei `WORKSPACE` eine Umgebungsvariable ist, die von Jenkins automatisch auf den korrekten Pfad gesetzt wird.

Weitere Optionen können an diesen String angehängt werden, z.B. `config.mvn_args += " --settings mysettings.xml"`. *Bitte Leerzeichen am Anfang des Strings nicht vergessen!*

## mvn deploy -> Nexus
wenn ihr mvn deploy() ausführen wollt, benötigt ihr den configFileProvider (dieses Plugin ist in unserem Jenkins enthalten). Dort ist die globale Settings.xml hinterlegt. Hier wurden unter "Server Credentials" die Credentials für den Zugang auf Nexus abgespeichert. Ihr braucht also nicht extra noch Credentials mitgeben, wenn ihr auf Nexus deployen wollt. Es ist lediglich die folgende Befehlszeile in eurem Jenkinsfile nötig:
`configFileProvider([configFile(fileId: 'default', variable: 'MAVEN_GLOBAL_SETTINGS')])` (WICHTIG: diese kommt vor den Script Block!) über die Variable `MAVEN_GLOBAL_SETTINGS` wird die settings.xml an mvn.deploy() übergeben.

## Ansible Service 
Bei Benutzung von Ansible muss im Jenkinsfile im Environmentblock der Name des entsprechenden ansible-playbook yml Files angegeben werden - in unserem fall liegen die Yml genau dort, wo auch die pom.xml liegt -> im workspace. Sollten die yml files bei euch in separaten ordnern liegen, dann gebt bitte den relativen Pfad (zum Workspace!) ein. Sowohl der Imagebuild als auch der Imagepush Service benötigen als Übergabeparameter die ansible-playbook yml files.
Für den Imagepush ist zudem noch ein Login auf Azure.io nötig. Die Credentials zu unserer Container Registry wurden unter `CredentialId:AZURECR`im credentials Manager abgespeichert. Ihr benötigt dann diese Befehlszeile im Jenkinsfile ums diese an die jeweiligen Methoden durchzureichen:
`withCredentials([usernamePassword(credentialsId: 'AZURECR', usernameVariable: 'AZURECR_USER', passwordVariable: 'AZURECR_PASSWORD')])` hier gilt noch folgendes zu beachten: wenn ihr images pusht kann das sehr lange dauern (der webblog hat fast 15 min gebraucht und ist fas 1 GB groß), zudem sollte darauf geachtet werden, dass auch die Container Registry nur begrenzt Speicherplatz zur Verfügung hat. 
Daher folgende Empfehlung: Wenn ihr pusht, nehmt erst mal ein kleines Dummy Image (wir haben da so ein nginx-testimage 'hello World' genommen) und ersetzt erst ganz am Schluss dieses durch den webblog
