package de.devopsdus2020.ansible

interface InterfaceAnsibleService extends Serializable {
    String imagebuild(Map config)
    String imagepush(Map config)
}