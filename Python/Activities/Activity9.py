lfirst=[3,5,7,8,10,20]
lsecond=[45,87,24,11,14,13]
lthird=[]
for n in lfirst:	
    if (n % 2 != 0):	
        lthird.append(n)
for n in lsecond:	
    if (n % 2 == 0):	
        lthird.append(n)
print(lthird)