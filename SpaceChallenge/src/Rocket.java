/**
 * Create a class Rocket that implements the SpaceShip Interface and hence implements all the methods above.
 *
 * launch and land methods in the Rocket class should always return true.
 * When U1 and U2 classes extend the Rocket class they will override these methods to return true or false
 * based on the actual probability of each type.
 * carry and canCarry should be implemented here and will not need to be overridden in the U1 and U2 classes
 */

public class Rocket implements Spaceship {

    int rocketCost; // million
    int rocketWeight; // tonnes
    int rocketMaxWeight;  // tonnes
    int currentWeight;
    int indexLaunchExplosion ;
    int indexLandCrash;


    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
       if ((this.currentWeight + item.itemWeight) <= this.rocketMaxWeight) {
         System.out.println("Can carry");
           return true;
        }else {
           return false;
       }
    }

    @Override
    public int carry(Item item) {
       this.currentWeight += item.itemWeight;
       System.out.println("Carrying: "+this.currentWeight);
       return currentWeight;
    }


}

