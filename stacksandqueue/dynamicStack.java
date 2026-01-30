
public class dynamicStack extends customStack {

    public dynamicStack() {
        super(); // it will call customStack 
    }

    public dynamicStack(int size) {
        super(size); // 
    }

    @Override // overriding the element. 
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            // copy all the previous items in the new data; 

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // ? at this point we made sure array is not full by adding edge cases
        return super.push(item); // insert it through main method . 
    }

}
/*
* OOps principles are being covered here majorly : Inheritence, Abstraction,
*/
