package de.devopsdus2020.docker

interface InterfaceDockerService extends Serializable {
    Integer getDockerVersion(Map config)
    Integer workWithDockerOption(Map config)
}