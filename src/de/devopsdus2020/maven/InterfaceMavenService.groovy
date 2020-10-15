package de.devopsdus2020.maven

interface InterfaceMavenService extends Serializable {
    Integer compile(Map config)
    String version()
    String test(Map config)
    String verify(Map config)
    String artifactpackage(Map config)
    String deploy(Map config)
}
