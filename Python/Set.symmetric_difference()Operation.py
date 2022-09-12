# Enter your code here. Read input from STDIN. Print output to STDOUT
a = int(input())
x = set(map(int,input().split()))
b = int(input())
y = set(map(int,input().split()))
# print(len(x.symmetric_difference(y))) #1st method
print(len(x ^ y)) #2nd method