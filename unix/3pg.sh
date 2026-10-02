echo "enter a 1st angle: "
read a
echo "enter 2nd angle"
read b
echo "enter 3rd angle"
read c

sum=$((a + b + c))
if [ "$sum" -eq 180 ] && [ "$a" -gt 0 ] && [ "$b" -gt 0 ] && [ "$c" -gt 0 ];
then
	echo "the triangle is valid"
else
	echo "the triangle is not valid"
fi
