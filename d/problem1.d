import std.stdio;

void main() {
    writeln(sumDivisorOfThreeOrFive(10));
    writeln(sumDivisorOfThreeOrFive(1000));
}

int sumDivisorOfThreeOrFive(int n) {
    int sum = 0;

    for (int i = 1; i < n; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }

    return sum;
}
