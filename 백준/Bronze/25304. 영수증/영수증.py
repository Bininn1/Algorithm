X = int(input())
n = int(input())
result = 0
for i in range(n) :
    a, b = map(int, input().split())
    result += (a*b)

if X == result :
    print("Yes")
else :
    print("No")