import org.scalatest.FunSuite

class RomanNumeralGeneratorImplTest extends FunSuite {

  test("Given tests and more") {

    assert(RomanNumeralGeneratorImpl.generate(1) === "I")
    assert(RomanNumeralGeneratorImpl.generate(5) === "V")
    assert(RomanNumeralGeneratorImpl.generate(10) === "X")
    assert(RomanNumeralGeneratorImpl.generate(20) === "XX")
    assert(RomanNumeralGeneratorImpl.generate(30) === "XXX")
    assert(RomanNumeralGeneratorImpl.generate(50) === "XXXXX")
    assert(RomanNumeralGeneratorImpl.generate(60) === "XXXXC")
    assert(RomanNumeralGeneratorImpl.generate(140) === "CXXXX")
    assert(RomanNumeralGeneratorImpl.generate(286) === "CCXXCVI")
    assert(RomanNumeralGeneratorImpl.generate(1245) === "MCCXXXXV")
    assert(RomanNumeralGeneratorImpl.generate(3999) === "MMMCMXCIX")
  }


}