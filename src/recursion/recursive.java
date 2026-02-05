
class recursive {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) { // # add check aka BASE condition. 
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

}
