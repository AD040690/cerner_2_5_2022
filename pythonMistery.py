# cerner_2tothe5th_2022
fruitTuple = ("apple", "banana", "cherry")  # creating a tuple
duplicateFruitList = list(fruitTuple)  # converting tuple to list and assigning to another variable
duplicateFruitList[1] = "kiwi"  # replacing 2nd element of list

print("containg elements in fruitTuple: %s" % (fruitTuple,))
print("containg elements in duplicateFruitList: %s" % (duplicateFruitList,))

# join multiple tuple using + or * operator
joinTuple = tuple(duplicateFruitList) + 2 * fruitTuple + tuple(["mango",[1,2,3],{"watermelon" : "Red","pineapple" : "yellow"},])
print("containg elements in joinTuple: %s" %(joinTuple,))

# use of loop and if-else
for element in joinTuple:  # for-each
    if isinstance(element, list):  # if element is list
        print("list elements: ")
        for innerElement in element:
            print(innerElement, )
    elif isinstance(element, dict):  # if element is dictionary
        print("dictionary key-value: ")
        for innerElement in element:
            print('Key -> {0} and value -> {1}'.format(innerElement, element[innerElement]))
    else:
        print(element, )
