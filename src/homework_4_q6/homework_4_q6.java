package homework_4_q6;
import java.util.Scanner;
import Vehicle.*;
import person.person;
public class homework_4_q6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int      mount=0;
		System.out.println("請輸入車輛數量");			
		mount=input.nextInt();
		Vehicle[] v=new Vehicle[mount];
		
		for(int i=0;i<v.length;i++){
			
			int type=0,cylinder=0,towing=0;
			String name,manufacture;
			
			System.out.println("請輸入車輛類型(1:Vehicle,2.Truck)");
			type=input.nextInt();
			
			System.out.println("請輸入車輛製造商");	
			input.nextLine();
			manufacture=input.nextLine();
			
			System.out.println("請輸入車輛擁有者名稱");	
			name=input.nextLine();
			
			System.out.println("請輸入車輛汽缸型號");	
			cylinder=input.nextInt();
			
			if(type>1){
				double load=0;
				System.out.println("請輸入車輛總載重能力");	
				input.nextLine();
				load=input.nextDouble();
				
				System.out.println("請輸入車輛總拖吊能力");	
				towing=input.nextInt();
				
				v[i]=new Truck(manufacture,cylinder,new person(name),load,towing);
			}
			else
				v[i]=new Vehicle(manufacture,cylinder,new person(name));
		}

		System.out.println("*****************************************************************");
		
		for(int i=0;i<v.length;i++){
			v[i].toString();
			System.out.println("*****************************************************************");
			}
		if(v.length>2){
			if(v[0].equals(v[1]))
				System.out.println("1跟2是一樣的");
				else
					System.out.println("1跟2是不一樣的");
		}
		input.close();		
		}
}
