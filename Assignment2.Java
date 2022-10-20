public class Assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("ERIKA");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("NAMIT");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("MONTALES");
        }
        // char array
        
        String[] myFirstName = {"E","R","I","K","A"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"A","K","I","R","E"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
}
    }
}
