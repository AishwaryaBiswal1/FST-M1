player1=input("enter name")
player2=input("enter name")
player1_choice=input("enter your choice among rock,paper,scissors")
player2_choice=input("enter your choice among rock,paper,scissors")

if player1_choice == player2_choice:	
    print("tie!")	
elif player1_choice == 'rock':	
    if player2_choice == 'scissors':	
        print("rock wins")	
    else:	
        print("paper wins")	
elif player1_choice == 'scissors':	
    if player2_choice == 'paper':	
        print("scissors win")	
    else:	
        print("rock wins")	
elif player1_choice == 'paper':	
    if player2_choice == 'rock':	
        print("paper wins")	
    else:	
        print("scissors win")	
else:	
    print("enter a valid input")