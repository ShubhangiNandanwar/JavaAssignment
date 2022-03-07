 
interface Test {
    public void wish();
}

class InterfaceEx3 {
    public static void main(String[] args) {
        Test t = new Test() {
            public void wish() {
                System.out.println("Hello World");
            }
        };
        t.wish();
    }
}