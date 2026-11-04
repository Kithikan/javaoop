import java.util.Scanner;
class MainStudent4 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();
lrg,rmor0jo
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
 
		System.out.print("Enter number of subjects : ");
		int n = input.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Subject " + (i + 1) + " Marks: ");
            marks[i] = input.nextInt();
        }
		Student4 s2 = new Student4(id,name);
        s2.setmarks( marks);                                                                                                                                             
        s2.display();

        input.close();
    }
}
