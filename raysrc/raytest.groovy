package tests

import org.junit.api.*
import org.junit.api.Assertions.*
import java.util.stream.*
import devopsdus2020.RayMyDocker
import dockerConnections.*


class MyDockerTest {

    @Test
    void checkCredentials() {
        def service [checkCredentials: { () -> true }] as DockerService
        rayMyDocker uut = new MyDocker(service)
        Boolean isOk = uut.checkCredentials()
        Assertions.assertTrue(isOk)
    }
}
