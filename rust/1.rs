fn main() {
    println!("{}", sum_divisor_of_three_or_five(10));
    println!("{}", sum_divisor_of_three_or_five(1000));
}

fn sum_divisor_of_three_or_five(n: u32) -> u32 {
    let mut sum = 0;

    for i in 1..n {
        if i % 3 == 0 || i % 5 == 0 {
            sum += i;
        }
    }

    return sum;
}
