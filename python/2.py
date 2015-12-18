def fibonacci(n):
  if n == 1:
    return 1
  elif n == 2:
    return 2
  else:
    return fibonacci(n-1) + fibonacci(n-2)

n = 1
sum = 0
while True:
  fibonacci_n = fibonacci(n)

  if fibonacci_n <= 4000000:
    if fibonacci_n % 2 == 0:
      print fibonacci_n
      sum += fibonacci_n
  else:
    break

  n += 1

print "sum: " + str(sum)
