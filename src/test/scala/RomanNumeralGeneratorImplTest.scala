import org.scalatest.FunSuite

class RomanNumeralGeneratorImplTest extends FunSuite {

  test("The given tests") {

    assert(RomanNumeralGeneratorImpl.generate(1) === "I")
    assert(RomanNumeralGeneratorImpl.generate(5) === "V")
    assert(RomanNumeralGeneratorImpl.generate(10) === "X")

  }


}