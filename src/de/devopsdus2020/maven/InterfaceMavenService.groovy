package de.devopsdus2020.maven

interface InterfaceMavenService extends Serializable {
    String compile(Map config)
    String version()
    String test(Map config)
    String verify(Map config)
    String package(Map config)
}
