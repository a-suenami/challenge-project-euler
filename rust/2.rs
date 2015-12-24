fn main() {
    fn fibonacci_numbers(n: u32) -> Vec<u32> {
        let fibonacci_n = fibonacci(n);

        if fibonacci_n <= 4000000 {
            if fibonacci_n % 2 == 0 {
                let mut vec = vec![fibonacci_n];
                vec.append(&mut fibonacci_numbers(n+1));
                return vec;
            } else {
                return fibonacci_numbers(n+1);
            }
        } else {
            let v : Vec<u32> = Vec::new();
            return v;
        }
    }

    for n in fibonacci_numbers(1) {
        println!("{}", n);
    }

    let sum = fibonacci_numbers(1).iter().fold(0, |sum, v| sum + v );
    println!("sum: {}", sum);
}

fn fibonacci(n: u32) -> u32 {
    if n == 1 {
        return 1;
    } else if n == 2 {
        return 2;
    } else {
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
