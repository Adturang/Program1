import java.util.Scanner;

public class FindIndex {
	
	public static int serchElement(int arr[],int element) {
		int ind=0;
		for (int i = 0; i < arr.length; i++) {
			if (element==arr[i]) {
				ind=i;
			}
		}
		return ind;
	}
	
	public static void replaceAllElement(int arr[],Scanner scanner) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for "+i+"th index");
			arr[i]=scanner.nextInt();
		}
		System.out.println("All The Elements are replaced");
	}
	
	public static void updateElement(int arr[],Scanner scanner) {
		System.out.println("Enter element to be Update");
		int ele=scanner.nextInt();
		System.out.println("Enter New element");
		int nele=scanner.nextInt();
		arr[serchElement(arr, ele)]=nele;
		System.out.println("Updated");
		System.out.println("Updated Array");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void operations(int arr[],Scanner scanner) {
		
		System.out.println("Choose Options: 1.Modify /n 2.Search Element");
		int option=scanner.nextInt();
		
		switch (option) {
		case 1:System.out.println("Option: a.Update/nb.Replace/n c.GoBack");
		char option2=scanner.next().charAt(0);
		switch (option2) {
		case 'a':updateElement(arr,scanner);
			
			break;
		case 'b':replaceAllElement(arr,scanner);
		
		break;
		case 'c':operations(arr, scanner);
		
		break;

		default:System.out.println("Invalid Option");
			break;
		}
		break;
		case 2: System.out.println("Enter the Element to be search");
		int sele=scanner.nextInt();
		int res=serchElement(arr, sele);
		System.out.println("The Element "+sele+" is on the index "+res);
			break;

		default:System.out.println("Invalid Option");
			break;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size  of Array");
		int size=scanner.nextInt();
		int arr[]=new int [size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element");
			arr[i]=scanner.nextInt();
		}
		
		operations(arr,scanner);
		
		
	}
	
}
