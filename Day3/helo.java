package Day3;

/*
 Question 4

constructor overloading

Create one default constructor to initialize the fields as default values to calculate 
volume of the cube and one parameterized constructor to pass parameters and initialize them 
accordingly. You can pass 3 integer parameters at runtime (While using parameterized constructor,
the program, should also display the output with the default constructor also)

Sample output- 

with parametrized constructor
Constructor without parameter
Volume is 1000.0
Constructor with parameter
Volume is 192.0
 */

 class Constructor {
    private int length;
    private int width;
    private int height;

    public Constructor() {
        this.length = 10;
        this.width = 10;
        this.height = 10;
    }

    public Constructor(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public void calculateVolume() {
        double volume = (double) this.length * this.width * this.height;
        System.out.printf("Volume is %.1f%n", volume);
    }

    public static void main(String[] args) {
        Constructor cuboidDefault = new Constructor();
        
        System.out.println("Constructor without parameter");
        cuboidDefault.calculateVolume();

        Constructor cuboidParameterized = new Constructor(3, 3, 3); 
        
        System.out.println("Constructor with parameter");
        cuboidParameterized.calculateVolume(); 
    }
}
