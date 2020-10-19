package de.devopsdus2020.ansible

interface InterfaceAnsibleService extends Serializable {
    Integer imagebuild(Map config)
    Integer imagepush(Map config)
    Integer imagepull(Map config)
}