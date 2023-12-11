//> using test.dep "org.scalameta::munit:0.7.29"
//> using test.dep "org.typelevel::munit-cats-effect:2.0.0-M1"

import munit.CatsEffectSuite
import cats.effect.IO

class Test extends CatsEffectSuite:
  test("hello"):
    assertEquals(1, 1)
