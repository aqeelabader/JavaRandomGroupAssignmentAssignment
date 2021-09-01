/*
Aqeel Abader
18008885
Programming Assignment
Question 2
 */
package question2;

// * @author Aqeel Abader 18008885

/* The concept of how this works is similar to what is discussed of the following sites:

    https://www.quora.com/How-do-I-pick-up-a-random-string-from-an-array-of-strings-in-Java
    and
    https://www.mkyong.com/java/java-return-a-random-item-from-a-list/    */


    import javax.swing.JOptionPane;
    import java.util.Random;

public class Question2 {
    
        //variables
    
        static String strName1, strName2, strName3; 
        
    public static void main(String[] args) {
     
        //the following collects the student name from the user
        strName1 = JOptionPane.showInputDialog(null,"Please enter the first student name: ");
        strName2 = JOptionPane.showInputDialog(null,"Please enter the second student name: ");
        strName3 = JOptionPane.showInputDialog(null,"Please enter the third student name: ");
        

        //the following creates random values for the student inputs
        String[] arr={"WHITE", "RED", "BLUE"};
        
        /*the reason i created two seperate inputs for random is to separate
        the random SELECTION of the house vs the GENERATION of the student number*/
        
        //generates the student number
        Random rand = new Random();
        
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000);
        int rand_int3 = rand.nextInt(1000);
        
        //randomly selects a house
        Random r = new Random();
        
        int randomHouse1 = r.nextInt(arr.length);
        int randomHouse2 = r.nextInt(arr.length);
        int randomHouse3 = r.nextInt(arr.length);
        
        //the following generates a report on the 'school house assignment' based on the user inputs collected
        JOptionPane.showMessageDialog(null, "SCHOOL HOUSE ASSIGNMENT"+"\n"+
                                 "****************************************"+"\n"+
                                strName1+" is assigned to the "+arr[randomHouse1]+" house"+
                                        " with student number "+arr[randomHouse1]+""+rand_int1+"\n"+
                                strName2+" is assigned to the "+arr[randomHouse2]+" house"+
                                        " with student number "+arr[randomHouse2]+""+rand_int2+"\n"+
                                strName3+" is assigned to the "+arr[randomHouse3]+" house"+
                                        " with student number "+arr[randomHouse3]+""+rand_int3+"\n");
    }
}
