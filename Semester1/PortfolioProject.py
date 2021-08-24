letters = ["A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z",]

def sortNames(listOfNames):
   for name in listOfNames:
      smallName = name
      for nextName in listOfNames:
         if  listOfNames.index(nextName) <= listOfNames.index(smallName):
            continue
         index = 0
         while smallName[index] == nextName[index]:
            index +=1
         i = letters.index(smallName[index])
         j = letters.index(nextName[index])
         if j < i:
            smallName = nextName
      a = listOfNames.index(name)
      b = listOfNames.index(smallName)
      if a < b:
         temp = listOfNames[a]
         listOfNames[a] = listOfNames[b]
         listOfNames[b] = temp
   print(listOfNames)
   

names1 = ["Pedro", "Winston", "Ramon", "Ana", "Deborah", "Alex", "Terry", "Joyce", "Neal", "Lawrence"]
print(names1)
sortNames(names1)
print()
names2 = ["Julius", "Brett", "Billy", "Ken", "Marguerite", "Lyle", "Ricardo", "Marian", "Walter", "Byron"]
print(names2)
sortNames(names2)
print()
names3 = ["Olivia", "Dwight", "Stacy", "Bertha", "Stephen", "Toni", "Lynda", "Rosemary", "Benjamin", "Darnell"]
print(names3)
sortNames(names3)
print()