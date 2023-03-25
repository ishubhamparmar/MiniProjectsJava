//Set of Boxes.
/*
   Insert the box details into the set. Create a box class and its attributes are length breadth and height (Double Type). Get the box details from
   the user and insert into the set. We need to store the details of the boxes with different volumes when the volume of the box is the same as the
   volume of previous boxes included don't add this box in the set.The boxes are called same when their volumes are equal.
*/
import java.util.*;
class vol{
    
    public static void main(String[] args) {
        Set<Double> volumeSet = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);
        char choice = 'Y';
        while(choice == 'Y'){
            System.out.println("Enter Length : ");
            double length = sc.nextDouble();   
            System.out.println("Enter Breadth : ");
            double breadth = sc.nextDouble();
            System.out.println("Enter Height : ");
            double height = sc.nextDouble();
            volumeSet.add(length*breadth*height);
            System.out.println("Do you want to add another box (Y/N) : ");
            choice = sc.next().charAt(0);
        }
        System.out.println(volumeSet);
        sc.close();
    }
    

}
