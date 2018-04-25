import java.util.Scanner;
public class old {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("wsfc");
for(int i=1;i<=5;i++){
	Scanner input = new Scanner (System.in);
	System.out.println("Type location of library, type # of books, type # of of staff, Type yearly expenses");
	Libray lib1 = new Library(input.nextLine() ,input.nextInt(),input.nextInt(),input.nextDouble());
	input.next();
	Libray lib2 = new Library(input.nextLine() ,input.nextInt(),input.nextInt(),input.nextDouble());
	input.next();
	Libray lib3 = new Library(input.nextLine() ,input.nextInt(),input.nextInt(),input.nextDouble());
	input.next();
	Libray lib4 = new Library(input.nextLine() ,input.nextInt(),input.nextInt(),input.nextDouble());
	input.next();
	Libray lib5 = new Library(input.nextLine() ,input.nextInt(),input.nextInt(),input.nextDouble());
	input.next();
	System.out.println(lib1.Location+" "+lib1.Books+" "+lib1.Staff+" "+lib1.expenses);
	System.out.println(lib2.Location+" "+lib2.Books+" "+lib2.Staff+" "+lib2.expenses);
	System.out.println(lib3.Location+" "+lib3.Books+" "+lib3.Staff+" "+lib3.expenses);
	System.out.println(lib4.Location+" "+lib4.Books+" "+lib4.Staff+" "+lib4.expenses);
	System.out.println(lib5.Location+" "+lib5.Books+" "+lib5.Staff+" "+lib5.expenses);
	
	input.close();
}
	}

}
