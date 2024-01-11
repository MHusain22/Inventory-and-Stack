import random

amount = 50000
list = []
def withdraw(amount,amt):
    if(amt%100!=0):
        print("Please enter a amount in the Multiple of 100.")
    elif(amt%100==0 and amt>10000):
        print("The Otp is : ",random.randrange(1000,9999))
        amount=amount-amt
        print("Balance is : ",amount)
        list.append(amt)
    
    elif(amt%100==0 and amt<10000):
        amount=amount-amt
        print("Balance is : ",amount)
        list.append(amt)

def deposit(amount,amt):
    if(amt%100!=0):
        print("Please enter a amount in the Multiple of 100.")
    else:
        note=int(input("Which Notes are u depositing : "))
        if(note==100):
            n=amt/100
            if(n<200):
                amount = amount + amt
                print("Balance is : ",amount)
                list.append(amt)
            else:
                print("Amount exceeding limit 200")
            
        if(note==500):
            n=amt/500
            if(n<500):
                amount = amount + amt
                print("Balance is : ",amount)
                list.append(amt)
            else:
                print("Amount exceeding limit 500")
            

def statement():
    list.reverse()
    for i in range(0,5):
        print(list[i])
    




while(True):
    # amt=int(input("Enter the Amount : "))
    print("1. Withdraw")
    print("2. Deposit")
    print("3. Statement")
    print("4. Exit")
    n=int(input("Enter your choice : "))
    if(n==1):
        amt=int(input("Enter the amount to withdraw : "))
        withdraw(amount,amt)
    elif(n==2):
        amt=int(input("Enter the amount to deposit : "))
        deposit(amount,amt)
    elif(n==3):
        statement()
    elif(n==4):
        break
    