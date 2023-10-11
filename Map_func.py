# Map () 

numbers = ['3', '36','64']

# I want to add +1 in the 2nd index that means 64+1 = 64

for i in range (len(numbers)):   # for loop for converting every element into int
    numbers[i] = int(numbers[i])
# We cant always use for loops for single line code to do the work 

numbers = list(map(int,numbers))
# before comma is the int that is what we want to apply
# after comma is numbers that is where we want to apply
# and list func because map returns object

numbers[2] = numbers[2] + 1
#print(numbers)

#2nd example

# we want to print the square of every element in the list
num = [2,3,4,5]

# def sq(x):
#     return x*x

# we can use map here with lamda func

num = list(map(lambda x: x*x , num))

print(num)