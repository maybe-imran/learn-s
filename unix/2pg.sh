echo "enter a number "
read n
echo "multiplication table of $n "
i=1
while [ "$i" -le 10 ]
do
	echo "$n X $i = $((n * i))"
	i=$((i + 1))
done

