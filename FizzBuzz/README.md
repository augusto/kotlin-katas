# FizzBuzz Kata in 3 acts

## Act 1:
Write some code that prints out the following for a contiguous range of numbers:

* the number
* 'fizz' for numbers that are multiples of 3
* 'buzz' for numbers that are multiples of 5
* 'fizzbuzz' for numbers that are multiples of 15

e.g. if I run the program over a range from 1-20 I should get the following output

    1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz

## Act 2:
Enhance your existing FizzBuzz solution to perform the following:

* If the number contains a three you must output the text 'lucky'. This overrides any existing behaviour

e.g. if I run the program over a range from 1-20 I should get the following output

    1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz

## Act 3:
Enhance your existing solution to perform the following:

* Produce a report at the end of the program showing how many times the following were output
  * fizz
  * buzz
  * fizzbuzz
  * lucky
  * an integer

e.g. if I run the program over a range from 1-20 I should get the following output

    1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz
    fizz: 4
    buzz: 3
    fizzbuzz: 1
    lucky: 2
    integer: 10 

(Integer is 10 because there were 10 numbers that were not altered in any way).