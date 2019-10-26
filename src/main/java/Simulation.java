public class Simulation {
    //make a Dice object instance named dice
    private Dice dice;
    //make a Bins object instance named bins
    private Bins bins;
    private int numberOfDice;
    private int sidesOfDice;
    private int numberOfThrows;

    public Simulation(int numberOfDice, int sidesOfDice, int numberOfThrows) {
        //assign values to dice
        dice = new Dice(numberOfDice,sidesOfDice);
        //assign values to bins
        bins = new Bins(numberOfDice, numberOfDice * sidesOfDice);
        this.numberOfThrows = numberOfThrows;
        this.numberOfDice = numberOfDice;
        this.sidesOfDice = sidesOfDice;
    }


    public void runSimulation() {      //
        //roll a bunch of dice
//        Dice dice = new Dice();
//        for(int i = 0; i < numberOfThrows; i++){
//            int result = dice.tossAndSum(numberOfDice,1,sidesOfDice);
        int result;
        for(int i = 0; i < numberOfThrows; i++){
            result = dice.tossAndSum();
//get the results and push them into a printout with a chart
            bins.incrementBin(result);
        }

    }

    public void printResults(){
        System.out.println("\n***");
        System.out.println("Simulation of " + numberOfDice + "D" + sidesOfDice + " tossed " + numberOfThrows + " times.");
        System.out.println("***");
        String s = "*";
        for (int i = numberOfDice; i <= sidesOfDice * numberOfDice; i++) {
            double per = (bins.getBin(i)/(double)numberOfThrows)*100;
            System.out.print(String.format("%2d: %7d: %2.0f percent: ", i, bins.getBin(i), per));
            for(int j = 0; j < per; j++){System.out.print("*");}
            System.out.print("\n");
        }
    }
}
