def sum(num):
    sum1=0;
    for n in num:
        sum1+=n
    return sum1
	
nlist = [20, 22, 45, 67]	
res = sum(nlist)	
print("sum of element: " + str(res))