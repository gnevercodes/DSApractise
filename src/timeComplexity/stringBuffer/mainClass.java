package timeComplexity.stringBuffer;

public class mainClass {

    public static void main(String[] args) {

        // ! constructor 1.
        StringBuffer buffer = new StringBuffer();
        buffer.append("blah"); // append 
        String str = buffer.toString(); // converting to string. 
        // many posibilities. 

        // ! constructor 2.
        // * sb object with a string initalizaed init.
        StringBuffer sb2 = new StringBuffer("ganesh");

        // ! const 3
        // # we give it a size initialized already. 
        StringBuffer sb3 = new StringBuffer(18);
        System.out.println(sb3.capacity());

        // ! Methods
        sb2.append(2);
        sb2.insert(2, "g");
        sb2.replace(2, 6, "blah");
        sb2.delete(2, 5);
        sb2.reverse();

    }
}
