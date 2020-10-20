import de.devopsdus2020.external.*

def execute() {
    this.steps.withCredentials(
            bindings: [
                this.steps.usernamePassword(
                    credentialsId: 'nexus',
                    usernameVariable: 'NEXUS_USER',
                    passwordVariable: 'NEXUS_PASSWORD')
            ]) {
        }
    }