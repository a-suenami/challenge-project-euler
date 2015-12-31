import std.stdio;
import std.math;

int[] primesUnder(int n) {
    int[] primes = [ 2 ];

    for (int i = 3; i < n + 1; i += 2) {
        bool isPrime = true;

        for (int j = 3; j < n + 1; j += 2) {
            if (i % j == 0 && i != j) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            primes ~= i;
        }
    }

    return primes;
}

long[] primeFactors(long n) {
    auto primes = primesUnder(cast(int)sqrt(cast(float)n));

    foreach (long i; primes) {
        if (n % i == 0) {
            auto m = n / i;
            return [ i ] ~ primeFactors(m);
        }
    }

    return [ n ];
}

void main() {
    writeln(primeFactors(13195));
    writeln(primeFactors(600851475143)); // very slow...
}
