for i in range(10, 100):
  for j in range(i, 100):
    n = i * j
    if str(n) == str(n)[::-1]:
      print "{} x {} = {}".format(i, j, n)

for i in range(100, 1000):
  for j in range(i, 1000):
    n = i * j
    if str(n) == str(n)[::-1]:
      print "{} x {} = {}".format(i, j, n)
