public class DataStructure {
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure(){
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven(){
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
    interface DataStructureIterator extends java.util.Iterator<Integer>{}

    // Inner class implements the DataStructureIterator interface
    // which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator{

        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        public boolean hasNext(){
            return (nextIndex <= SIZE -1);
        }

        public Integer next() {
            Integer retValue =Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
