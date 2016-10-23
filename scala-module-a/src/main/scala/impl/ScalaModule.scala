package impl

import api.IScalaTest

class ScalaModule extends IScalaTest{
  override def hello: Unit = {
    println("Hello from scala")
  }
}
