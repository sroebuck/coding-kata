object RomanNumeralGeneratorImpl extends RomanNumeralGenerator {
	
  def generate(number: Int): String = {
    assume(number <= 10)
    lookup(number)
  }

  private lazy val lookup = Map(
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

}