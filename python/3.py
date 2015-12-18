import math

def primes_under(n):
  primes = [ 2 ]

  for i in range(3, n + 1, 2):
    for j in range(3, n + 1, 2):
      is_prime = True

      if i % j == 0 and i != j:
        is_prime = False
        break

    if is_prime: 
      primes.append(i)

  return primes

def prime_factors(n):
  primes = primes_under(int(math.sqrt(n)))

  for i in primes:
    if n % i == 0:
      m = n / i
      return [ i ] + prime_factors(m)

  return [ n ]

print prime_factors(13195)
# print prime_factors(600851475143) # very slow...
