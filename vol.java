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