def fruits_people():

  #get the number of items
  apple = int(input("Enter the amount of apples: "))
  banana = int(input("Enter the amount of bananas: "))
  orange = int(input("Enter the amount of oranges: "))
  mango = int(input("Enter the amount of mangoes: "))
  pineapple = int(input("Enter the amount of pineapples: "))

  # Get the number of people
  people = int(input("Enter the number of people: "))

  #confirm the amount 
  print("The amount of apples are:", apple)
  print("The amount of bananas are:", banana)
  print("The amount of oranges are:", orange)
  print("The amount of mangos are:", mango)
  print("the amount of pineapples are", pineapple)
  print("The number of people are:", people)

  #for apple
  if apple<people or apple/people<=0:
    print("not enough appels")
  elif apple>people and apple/people!=0:
    print("apple_per_person :",apple//people)
    print("left_over_apple :",apple%people)
  
  #for banana
  if banana<people or banana/people<=0:
    print("not enough bananas")
  elif banana>people and banana/people!=0:
    print("banana_per_person :",banana//people)
    print("left_over_bananas :",banana%people)

  #for orange  
  if orange<people or orange/people<=0:
    print("not enough oranges")
  elif orange>people and orange/people!=0:
    print("orange_per_person :",orange//people)
    print("left_over_oranges :",orange%people)
  
  #for mango
  if mango<people or mango/people<=0:
    print("not enough mangoes")
  elif mango>people and mango/people!=0:
    print("mango_per_person :",mango//people)
    print("left_over_mangoes :",mango%people)
  
  #for pineapple
  if pineapple<people or pineapple/people<=0:
    print("not enough pineapples")
  elif pineapple>people and pineapple/people!=0:
    print("pineapple_per_person :",pineapple//people)
    print("left_over_pineapples :",pineapple%people)

fruits_people()
              







 
 
  
  
                          


     


