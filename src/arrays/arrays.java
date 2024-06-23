package arrays;

public class arrays {
    // An array is a collection of values as one entity
    // all values must be of the same data type
    // The bracket can appear after the data type or after the name itself
    // the number inside of the brackets represents the links of the array

    public static void main(String[] args) {

        String[] players = new String[6];
        players[0] = "Bob";
        players[1] = "Luke";
        players[2] = "Chad";
        players[3] = "Dan";
        players[4] = "Henry";
        players[5] = "Joe";

        String[] players2 = {"bob", "luke", "dan", "henry"};

        System.out.println("The third player is " + players[2]);

        boolean chadFound = false;

        for(int i=0; i<players.length; i++){
            if(players[i].equals("Chad")){
                chadFound = true;
            }
        }

        calculateSum();
        calculateSum(2, 4);
        calculateSum(2, 4, 6, 8, 10);
        calculateSum(new int[]{2, 4, 6, 7});
    }

    // Variable arguments, use ... three dots and then the variable name
    // A method can only have one varargs parameter (...)
    // The varargs parameter must be the last parameter

    public static void calculateSum(int ...a){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
