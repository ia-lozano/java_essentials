package creating_methods;

public class overloadingMethods {
    public static void main(String[] args){
        // The method signature includes its name and argument type
    }

    public class Month {
        // This is perfectly legal
        public static String getMonth(int month) {
            return "";
        }

        public static int getMonth(String month) {
            return 1;
        }

        // However, trying to define an overloading method with
        // the same parameter list, you'll get an error

        // public static String getMonth(String stringMonth){
        // This will return an error }
    }
}
