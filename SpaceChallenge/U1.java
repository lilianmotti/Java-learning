/**
 * Create classes U1 that extend the Rocket class and override the land and launch methods to
 * calculate the corresponding chance of exploding and return either true or false based on
 * a random number using the probability equation.
 *
 * U1
 * Rocket cost = $100 Million
 * Rocket weight = 10 Tonnes
 * Max weight (with cargo) = 18 Tonnes
 * Chance of launch explosion = 5% * (cargo carried / cargo limit)
 * Chance of landing crash = 1% * (cargo carried / cargo limit)
 */


public class U1 extends Rocket {

    U1(){
        rocketCost = 100; // million
        rocketWeight = 1000; // tonnes
        rocketMaxWeight = 1800;  // tonnes
        indexLaunchExplosion = 5; //5% *( cargo carried / cargo limit)
        indexLandCrash = 1; //1%*(cargo carried / cargo limit)
    }

    public boolean launch() {
        double randomN = (Math.random()*100);
        //System.out.println("random number: "+ randomN); //random number 0-99
        double succeed=  indexLaunchExplosion* (double) currentWeight/rocketMaxWeight;
        System.out.println("Probability of launch succeeding=" + succeed);
         if (succeed <= randomN) {
             System.out.println("Launch succeeded.");
             return true;
         } else {
             System.out.println("Rocket exploded when launching.");
             return false;
         }
    }

    public boolean land() {
        double randomN = (Math.random() * 100);
        //System.out.println("random number: "+ randomN); //random number 0-99
        double succeed = indexLandCrash * (double) currentWeight / rocketMaxWeight;
        System.out.println("Probability of land succeeding=" + succeed);
        if (succeed <= randomN) {
            System.out.println("Landed successfully.");
            return true;
        } else {
            System.out.println("Rocket crashed when landing.");
            return false;
        }
    }
}
