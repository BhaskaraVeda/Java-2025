package Day4;

/*
Question 4

Volume

Write a program in java to exploit constructor overloading. 
(cube and cuboid volume calculation)

i)  Create a class ThreeDimensionShape with three variables width, height, depth;

ii)  Create three constructors
a)     Doesn’t accepts any parameter
b)     Accepts 1 parameter of type double(length)
c)     Accepts 3 parameter of type double(width, height, depth)

iii)  Create a method volume of type double that returns a product of width, height, and depth.

iv)  in case of No argument constructor make length=width=depth = 0;

v)  in case of 1 argument constructor make length=width=depth = length;
 */

 class ConstructorOverloadingDemo
{
    public static void main(String args[])
    {
        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7); 
        
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

        double volume;

        volume = shape1.volume();
        System.out.println("Volume of shape1 is " + volume);

        volume = shape2.volume();
        System.out.println("Volume of shape2 is " + volume);

        volume = shape3.volume();
        System.out.println("Volume of shape3 is " + volume);
    }
}

class ThreeDimensionShape
{
    double width, height, depth;

    ThreeDimensionShape (double w, double h, double d)
    {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    ThreeDimensionShape (double l)
    {
        this.width = this.height = this.depth = l;
    }

    ThreeDimensionShape()
    {
        this.width = this.height = this.depth = 0;
    }

    double volume()
    {
        return width * height * depth;
    }
}