package creating_methods;

public class variableScope {
    public static void main(String[] args){
        VariableScopeExample example = new VariableScopeExample();
        example.method1();
        example.method2();
    }

    public static class VariableScopeExample{
        String myVar = "abc"; // declaring global variable

        public void method1(){
            System.out.println("global: " + myVar); // referencing global variable
            String myVar = "def"; //defining local variable
            System.out.println("local: " + myVar); // referencing local variable
            System.out.println("global: " + this.myVar); // referencing global variable .this keyword
        }

        public void method2(){
            System.out.println("global: " + myVar); // referencing global variable
            myVar = "ghi"; // update global variable
            System.out.println("global: " + myVar); // referencing global variable
        }
    }
}


