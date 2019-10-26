
public class Bins {

    private int min;
    private int max;
    private int[] counter;


    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int[] getCounter() {
        return counter;
    }

    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        this.counter = new int[max+1];
    }

    public int getBin(int binIndex){
        return counter[binIndex];
    }

    public void incrementBin(int binIndex){
        counter[binIndex]++;
    }

}