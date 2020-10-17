package de.devopsdus2020.external

class ConfigService implements Serializable {

    def steps
    ConfigService(steps) {
        this.steps = steps
    }
}