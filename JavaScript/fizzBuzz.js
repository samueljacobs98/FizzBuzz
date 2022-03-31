const min = process.argv[2];
const max = process.argv[3];

for (let i = min; i <= max; i++) {
  if ((i % 3 == 0) & (i % 5 == 0)) console.log(i + " FizzBuzz");
  else if (i % 3 == 0) {
    console.log(i + " Fizz");
  } else if (i % 5 == 0) {
    console.log(i + " Buzz");
  }
}
