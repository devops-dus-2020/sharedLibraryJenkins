import de.devopsdus2020.external.*

def execute() {
    this.steps.configFileProvider(
            bindings: [[
                this.steps.configFile(
                    fileId: 'default',
                    variable: 'MAVEN_GLOBAL_SETTINGS')
            ]]) {
        }
    }
