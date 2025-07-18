package timeComplexity.class4;

public class access {

    private int num;
    private String name;

    public int getNum() { // getters and setters . should be public. 
        return num;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        access one = new access();
        System.out.println(one instanceof Object);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
