import java.util.Scanner;
class MainStudent3 {
    public static void main(String[] args) {
        Student3 s2 = new Student3();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

		System.out.print("Enter number of subjects : ");
		int n = input.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Subject " + (i + 1) + " Marks: ");
            marks[i] = input.nextInt();
        }

        s2.setstudent3(id, name, marks);
        s2.display();

        input.close();
    }
}
