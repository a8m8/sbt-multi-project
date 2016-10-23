package impl

import org.specs2.Specification

class ScalaModuleSpec extends Specification { def is = s2"""

 This is my first specification
   it is working                 $ok
   really working!               $ok
                                 """
}
