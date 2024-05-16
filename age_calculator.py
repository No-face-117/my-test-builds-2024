import math

def test_fun():
    while True:
        should_input = input("Would_you_like_to_input(y/n): ")
        if should_input.lower() != "y":
            break

        age_before_voyage = input("Please_enter_age_before_voyage: ")
        time_during_voyage_normal = input("Please_enter_the_normal_time_during_voyage: ")
        if age_before_voyage.isdigit() and time_during_voyage_normal.isdigit():
            age_before_voyage = int(age_before_voyage)
            time_during_voyage_normal = int(time_during_voyage_normal)
        
        speed_of_light = C = 299792458
        speed_of_craft = input("Pease_enter_speed_of_craft: ") 

        if speed_of_craft.isdigit():
            speed_of_craft = int(speed_of_craft)
            speed_of_light = int(299792458)
        else:
            print("unable")
            break

        if speed_of_craft > 1 :    
            actual_age = (age_before_voyage + (time_during_voyage_normal*(1-(speed_of_craft/speed_of_light)**2)))
        else:
            actual_age = (age_before_voyage + (time_during_voyage_normal*(1-(speed_of_craft/1)**2)))


        print("Actual_age = ",actual_age)

test_fun()

            
             
        


        
        
              







 
 
  
  
                          


     


