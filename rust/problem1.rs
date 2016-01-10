fn main() {
    println!("{}", sum_divisor_of_three_or_five(10));
    println!("{}", sum_divisor_of_three_or_five(1000));
}

fn sum_divisor_of_three_or_five(n: u32) -> u32 {
    (1..n).filter(|x| x % 3 == 0 || x % 5 == 0).fold(0, |current, x| current + x)
}
