package de.devopsdus2020.external

class PasswordService implements Serializable {

    def steps
    PasswordService(steps) {
        this.steps = steps
    }
}