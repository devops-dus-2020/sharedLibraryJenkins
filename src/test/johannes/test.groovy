package johannes.tests

import org.junit.jupiter.api.*
import johannes.devopsdus2020.*
import johannes.dockerConnections.*

class MyDockerTest {

  @Test
  void checksCredentials() {
      def service = [checkCredentials: { true }] as IDockerService
      MyDocker uut = new MyDocker(service)
      Boolean isOk = uut.checkCredentials()
      Assertions.assertTrue(isOk)
  }

}