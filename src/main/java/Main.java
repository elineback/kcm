public class Main {

    public static void main(String[] args) {
        Elevator one = new Elevator();
        Elevator two = new Elevator();
        one.setCurrentFloor(0);
        two.setCurrentFloor(0);

        List<Elevator> elevators = new ArrayList<Elevator>();
        elevators.add(one);
        elevators.add(two);

        //logic here for now and then move to a service class
        int summonsFloor = 4;
        processSummons(summonsFloor, one, two);

    }

    public void processSummons(int floorSummons, List<Elevator> elevators){


        //Check first if occupied and will be passing floor since this elevator will be moving
        // and needs to be returned first if available
        //First filter by occupied
        List<Article> filteredArticleList= elevators.stream().filter(e -> e.getOccupied.isTrue.collect(Collectors.toList());

        //Second compare floor destination against summons and see if on the way
        elevators.forEach( e -> {
            int e.getDestination - e.getCurrentFloor
        })

        //If no occupied elevator is passing this floor then check for nearest non-occupied elevator
        //First sort list by floor
        Collections.sort(elevators, Comparator.comparingInt(Elevator::getCurrentFloor));


    }
}
