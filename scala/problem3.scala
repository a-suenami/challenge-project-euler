import Math.sqrt

object Main {
  def main(args: Array[String]) {
    println(primeFactors(13195:Long))
    // java.lang.StackOverflowError... :sweat:
    // println(primeFactors(600851475143:Long))
  }

  def primeFactors(n: Long): List[Long] = {
    val primeFactorCandidates = primes(2, sqrt(n.asInstanceOf[Float]).asInstanceOf[Long])
    val primeFactor = primeFactorCandidates.find(m => n % m == 0)

    primeFactor match {
      case Some(m) => m :: primeFactors(n / m)
      case None => List(n)
    }
  }

  def primes(min: Long, max: Long): List[Long] = {
    (min, max) match {
      case (min, max) if min > max => List.empty[Long]
      case (min, _) if isPrime(min) => min :: primes(min + 1, max)
      case (min, max) => primes(min + 1, max)
    }
  }

  def isPrime(n: Long): Boolean = (2:Long to n-1).filter(m => n % m == 0).isEmpty
}
