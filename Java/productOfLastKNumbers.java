// Benjamin Gensler
// 2/14/25
// 1352. Product of the Last K Numbers
// Create the class ProductOfNumbers, making the functions ProductOfNumbers (Initialize the list of numbers), add( add num to list), and getProduct( returns the product of last k numbers of list)
class ProductOfNumbers {
    private ArrayList<Integer> stream = new ArrayList<>();
    public ProductOfNumbers() {
        //Initializing the arrayList with a 1 to avoid incorrect multiplication
        this.stream.add(1);
    }
    
    public void add(int num) {
        //adding the num to the arrayList
        this.stream.add(num);
    }
    
    public int getProduct(int k) {
        //Setting product as 1 to avoid error
        int product = 1;

        //loop to collect hte last k values to multiply onto product
        for(int i = 0; i < k; i++){
            product *= this.stream.get(this.stream.size() - 1 - i);
        }

        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
