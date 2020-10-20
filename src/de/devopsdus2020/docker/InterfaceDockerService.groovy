package de.devopsdus2020.docker

interface InterfaceDockerService extends Serializable {
    Integer getDockerVersion(Map config)
    Integer executeWithDockerOption(Map config)
    Integer executeWithDockerCompose(Map config)
}