package neu.edu.coe.csye7200

import org.scalatest.{FlatSpec, Matchers}
class HelloWorldSpec extends FlatSpec with Matchers {
  behavior of "HelloWorld"
  it should "get the correct greeting" in {
    HelloWorld.greeting shouldBe "Hello World!"  }
}
