# Filter func is a func that returns a list which is true at a given condition
list1 = [1,2,3,4,5,5,6,7,8,9,10]
def filt(num):
    return num>5

greater_than_5 = list(filter(filt, list1))
print(greater_than_5)