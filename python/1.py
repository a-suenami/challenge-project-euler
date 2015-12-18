def sum_divisor_of_three_or_five(n):
  sum = 0
  
  for n in range(1, n):
    if n % 3 == 0 or n % 5 == 0:
      sum += n

  return sum

print sum_divisor_of_three_or_five(10)
print sum_divisor_of_three_or_five(1000)
