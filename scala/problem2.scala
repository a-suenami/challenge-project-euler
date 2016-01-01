object Main {
  def main(args: Array[String]) {
    val answer = fibonacciNumbers(from = 1, max = 4000000).filter(n => n % 2 == 0).sum
    println(answer)
  }

  def fibonacciNumbers(from: Int, max: Int): List[Int] = {
    fibonacci(from) match {
      case n if n < max => fibonacci(from) :: fibonacciNumbers(from + 1, max)
      case _ => List.empty[Int]
    }
  }

  def fibonacci(n: Int): Int = {
    n match {
      case 1 => 1
      case 2 => 2
      case n => fibonacci(n-1) + fibonacci(n-2)
    }
  }
}
