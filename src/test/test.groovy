package tests

import org.junit.jupiter.api.*
import devopsdus2020.*
import dockerConnections.*

class MyDockerTest {

  @Test
  void checksCredentials() {
      def service = [checkCredentials: { true }] as DockerService
      MyDocker uut = new MyDocker(service)

      Boolean isOk = uut.checkCredentials()
      Assertions.assertTrue(isOk)
  }

  @Test
  void checksCredentials() {
      def service = [checkCredentials: { true }] as DockerService
      MyDocker uut = new MyDocker(service)
      Boolean isOk = uut.checkCredentials()
      Assertions.assertTrue(isOk)
  }

}