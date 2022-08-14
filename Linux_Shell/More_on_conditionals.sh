read a 
read b 
read c 
if [ $a -eq $b ] || [ $b -eq $c ] || [ $c -eq $a ];
then
    if [ $((a+b)) -eq $((c*2)) ];
    then
        echo "EQUILATERAL"
    else
        echo "ISOSCELES"
    fi
else
    echo "SCALENE"
fi
