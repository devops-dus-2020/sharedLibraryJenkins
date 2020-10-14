package de.devopsdus2020.maven

interface InterfaceMavenService extends Serializable {
    String compile()
    String compile(Map config)
    String version()
}
