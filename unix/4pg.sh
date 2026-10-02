echo "enter number (separated by space): "
read -a arr 

pos=0
neg=0
zero=0

for num in "${arr[@]}"
do
	if [ "$num" -gt 0 ];
	then
		pos=$((pos + 1))
	elif [ "$num" -lt 0 ];
	then
		neg=$((neg + 1))
	else
		zero=$((zero + 1))
	fi
done

echo "number entered : ${arr[@]}"
echo "positive numbers = $pos"
echo  "negative number = $neg"
echo "zeros 		= $zero"
