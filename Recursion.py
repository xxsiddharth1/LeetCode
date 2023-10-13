# Factorial
# n! = 1*2*3.....*n

def factorial_iter(n):
    product = 1
    for i in range(n):
        product = product * (i+1) # i+1 because it should start from 1
    return product

f = factorial_iter(5)
print(f)

# Using recursion
# n! = 1*2*3*4.....*(n-1)* n
# n! = n* (n-1)!

def factorial_recursive(n):
    if n==1 or n==0:
        return 1
    return n * factorial_recursive(n-1)

f1 = factorial_recursive(5)
print(f1)