def fib(num):
    if num <= 1:
        return num
    else:
        return (fib(num-1) + fib(num-2))
n = int(input("enter num"))
if n<=0:
    print("enter number")
else:
    print("fibonnaci series")
    for i in range(n):
        print(fib(i))