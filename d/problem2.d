import std.stdio;

int fibonacci(int n) {
    if (n == 1) { return 1; }
    if (n == 2) { return 2; }

    return fibonacci(n-1) + fibonacci(n-2);
}

void main() {
    int n = 1;
    int sum = 0;

    while (true) {
        int fibonacciN = fibonacci(n);
        if (fibonacciN > 4000000) { break; }

        if (fibonacciN % 2 == 0) {
            sum += fibonacciN;
        }

        n++;
    }

    printf("sum: %d\n", sum);
}
