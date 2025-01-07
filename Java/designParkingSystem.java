// Benjamin Gensler
// 1/7/2025
// 1603. Design Parking System
// Takes in the information of available spaces and car types and returns if they are able to fit in the parking garage or not

class ParkingSystem {
  // class private variables (Holds current available parking spots
    private int bigSpaces;
    private int mediumSpaces;
    private int smallSpaces;

    // Collects the information of how many spots are available in the parking garage
    public ParkingSystem(int big, int medium, int small) {
      // assigning the parking spaces to class variables
        this.bigSpaces = big;
        this.mediumSpaces = medium;
        this.smallSpaces = small;
    }

  // Checks to see if the current car is able to fit in the parking garage
    public boolean addCar(int carType) {
      // Checks for small available
        if(carType == 3 && this.smallSpaces > 0){
                this.smallSpaces--;
                return true;
        }
      // Checks for medium available
        if(carType == 2 && this.mediumSpaces > 0){
                this.mediumSpaces--;
                return true;
        }
      // Checks for big available
        if(carType == 1 && this.bigSpaces > 0){
                this.bigSpaces--;
                return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
