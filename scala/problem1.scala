object Main {
  def main(args: Array[String]) {
    println(sumDivisorOfThreeOrFive(10))
    println(sumDivisorOfThreeOrFive(1000))
  }

  def sumDivisorOfThreeOrFive(n: Int): Int = {
    return (1 to n).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }
}
