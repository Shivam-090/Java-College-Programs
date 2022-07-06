import java.util.*;

public class Years{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minutes");
		int min = sc.nextInt();
		int days = min / 1440; // 60 * 24
		int months = min / 43200; // 24 * 60 * 30
		int years = min / 525600; // 
		System.out.println(" " + years + " - " + months +" - " + days);
	}
}