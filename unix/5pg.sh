#!/bin/bash

echo "Enter an integer number:"
read num

n=$num
count=0
sum=0

# Handle negative numbers
if [ $n -lt 0 ]; then
    n=$(( -1 * n ))
fi

while [ $n -gt 0 ]
do
    digit=$(( n % 10 ))
    sum=$(( sum + digit ))
    n=$(( n / 10 ))
    count=$(( count + 1 ))
done

echo "Number entered: $num"
echo "Total digits = $count"
echo "Sum of digits = $sum"
