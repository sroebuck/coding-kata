object RomanNumeralGeneratorImpl extends RomanNumeralGenerator {
	
  def generate(number: Int): String = {
    assume(number <= 100)
    number match {
      case x if x <= 10 => lookupUnits(number)
      case x if x <= 100 =>
        val units = x % 10
        val tens = x / 10
        lookupTens(tens) + lookupUnits(units)
    }
  }

  private lazy val lookupUnits = Map(
      0 -> "",
      1 -> "I",
      2 -> "II",
      3 -> "III",
      4 -> "VI",
      5 -> "V",
      6 -> "VI",
      7 -> "VII",
      8 -> "IIX",
      9 -> "IX",
      10 -> "X"
    )

  private lazy val lookupTens = Map(
      0 -> "",
      1 -> "X",
      2 -> "XX",
      3 -> "XXX",
      4 -> "XXXX",
      5 -> "XXXXX",
      6 -> "XXXXC",
      7 -> "XXXC",
      8 -> "XXC",
      9 -> "XC",
      10 -> "C"
    )

}