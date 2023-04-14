
class myClass { //implement binary search
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 6, 10, 11, 23, 25, 26, 30};
        System.out.println(binarySearch(array));
    }

    public static int binarySearch(int[] array) {
        int IndexHigh = array.length - 1; //array.length equals 10
        int IndexLow = 0;
        while (IndexLow <= IndexHigh) {
            int IndexMid = (int) (Math.floor(IndexHigh + IndexLow) / 2);

            if (array[IndexMid] == 23) { //target is 23
                return IndexMid;
            } else if (array[IndexMid] < 23) {
                IndexLow = IndexMid + 1;
            } else {
                IndexHigh = IndexMid - 1;
            }
        }
        return -1;
    }
}

