package de.devopsdus2020.ansible

interface InterfaceAnsibleService extends Serializable {
    Integer imagebuild(Map configbuild)
    Integer imagepush(Map configpush)
}