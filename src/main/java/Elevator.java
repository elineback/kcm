
public class Elevator {

    private Long id;
    private int currentFloor;
    private int destination;
    private int direction;// 0 for up and 1 for down
    private Boolean occupied;
    private Boolean onTrip;
    private int totalTrips;
    private int totalFloorsTraveled;
    private Boolean operational;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int currentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Boolean getOnTrip() {
        return onTrip;
    }

    public void setOnTrip(Boolean onTrip) {
        this.onTrip = onTrip;
    }

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public int getTotalFloorsTraveled() {
        return totalFloorsTraveled;
    }

    public void setTotalFloorsTraveled(int totalFloorsTraveled) {
        this.totalFloorsTraveled = totalFloorsTraveled;
    }

    public Boolean getOperational() {
        return operational;
    }

    public void setOperational(Boolean operational) {
        this.operational = operational;
    }

}