package objects;

// NOTE: Encapsulation is one of the key principles in OOP
// public: Any class can access, use or refer to the field
// private: Only the current class can access, use, or refer to the field

// protected: only classes within the same package can access it

public class rectangle {
    private double length;
    private double width;

    // Constructors are used to initialize field or fields in an object
    // all objects have a constructor, and the very first type is the
    // default constructor, which has no parameter list.

    // Default constructor is typically used to assign default values to fields
    // the default constructor is always defined implicitly.
    // You can define it explicitly (must have the exact same name as the class):

    public rectangle(){
        length = 0;
        width = 0;
    }

    // you can create as many constructors as you want
    public rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
