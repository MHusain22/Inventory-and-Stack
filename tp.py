# import random

# num = random.randint(0, 20)
# flag=0
# for i in range(0,5):
#     n=int(input("Enter the number : "))
#     if(n<num):
#         print("{} is less than num".format(n))
#     elif(n>num):
#         print("{} is greater than num".format(n))
#     else:
#         flag=1
#         print("equal")
#         break

# if(flag==0):
#     print("Better luck next time.")

# pip install emoji
# import emoji
# print(emoji.emojize('Python is :thumbs_up:'))
# # print(emoji.demojize('Python is 👍'))

# n = input("Enter the emoji : ")
# print(emoji.demojize(n))

# pip install datetime
# import datetime

# x = datetime.datetime.now()

# n=input("Enter Date : ")
# print(x.day," ",x.month," ",x.year)
# print(x.strftime("%A"))

# # valid date
# def validDate(year, month, day):
#     countmonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
#     if year%4==0 and (year%100 != 0 or year%400==0):
#         countmonth[1] = 29
#     return (1 <= month <= 12 and 1 <= day <= countmonth[month])


# print(str(validDate(2001,13,1)))

# import calendar as cd

# year = 2024
# month = 2
# print(cd.month(year,month))
 