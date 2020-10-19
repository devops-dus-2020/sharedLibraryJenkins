package de.devopsdus2020.docker

interface InterfaceDockerService extends Serializable {
    Integer dockerversion(Map config)
}