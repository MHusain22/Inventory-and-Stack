# Display inventory stock
# search by id
# search by name
# buy from vendor
# send the id to customer
# break
import sys

l1 = [101,102,103,104,105]
l2 = ["rice","wheat","flour","grains","dal"]
l3 = [10,30,20,40,50]
l4 = [121,320,210,140,510]

def display(l1,l2,l3,l4):
    print("ids Name quantity price") 
    for i in range(0,4): 
        print(l1[i],l2[i]," ",l3[i],"    ",l4[i])

def sid(a):
    flag=0
    for i in range(0,4):
        if(a==l1[i]):
            flag=1
            print(l1[i],l2[i],l3[i],l4[i])
    if(flag==0):
        print("Id is Not Found!!")

def sname(nm):
    flag=0
    for i in range(0,n):
        if(nm==l2[i]):
            flag=1
            print(l1[i],l2[i],l3[i],l4[i])
    if(flag==0):
        print("Invalid name!!")

def vendor(a,b):
    for i in range(0,4):
        if(a==l1[i]):
            l3[i]=l3[i]+b
            print("Your Price ",l4[i]*b)

def sell(a,b):
    for i in range(0,4):
        if(a==l1[i]):
            l3[i]=l3[i]-b
            print("Your Price ",l4[i]*b)


while(1):
    print("1. Display the Inventory : ")
    print("2. Search by id ")
    print("3. Search by name ")
    print("4. Buy from vendor ")
    print("5. sell to customer ")
    print("6. Exit")
    print("------------------- ")
    n = int(input("Enter your choice : "))
    if(n==1):
        display(l1,l2,l3,l4)
    elif(n==2):
        a = int(input("Enter the id : "))
        sid(a)
    elif(n==3):
        nm = ("Enter name : ")
        sname(nm)
    elif(n==4):
        a = int(input("Enter id to buy :"))
        b= int(input("Enter Quantity to buy: "))
        vendor(a,b)
    elif(n==5):
        a = int(input("Enter the id: "))
        b= int(input("Enter Quantity to sell: "))
        sell(a,b)
    elif(n==6):
        sys.exit()


