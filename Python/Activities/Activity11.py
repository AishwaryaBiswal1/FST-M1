	
fruit_shop = {	
    "apple": 10,	
    "banana": 15,	
    "orange": 8,	
    "peaches": 15	
}	
key_to_check = input("you are searching for which fruit ").lower()	
if(key_to_check in fruit_shop):	
    print("available")	
else:	
    print("not available")