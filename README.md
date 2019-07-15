# kcm

Going to write in Java since it would be easier for me.

First I am going to sketch out some ideas on what I need here in the ReadMe.
Second I will begin creating some objects and services to run in the main. 

Objects needed.
Elevator
- CurrentFloor
- Occupied
- FarthestDestination
- Trip(Summons or Taxing)
- TotalTrips
- TotalFloorsTravelled
- TripsTravelled
- Operational


Controllor
-TotalOfElevators
-TotalOfFloors

Controller Service
Start with two elevators e1 and e2 and 10 floors.

Some cases to refine logic.

Case one = 
e1 and e2 are unoccupied and are on ground floor. Rider summons on floor5. Controller will send the elevator that has fewer tripsTravelled since both are on equal distant floors.

Case two = 
e1 is on floor 0 unoccupied and e2 is on floor 2 occupied and heading to floor 4. Rider summons on floor6. e1 goes to floor 6 because e2 will not pass by the needed floor. 

Case three = 
e1 is occupied and going down to 0 and is on floor 2. e2 is occupied and going down to 1 and is on floor 4. summons from floor 7. this summons has to wait for either an unoccupied elevator or one that will pass by.




