package Vehicle;
import person.person;

public class Vehicle {

	private String manufactureName;
	private int cylinders;
	private person owner;
	
	public  Vehicle(){
		this.manufactureName="N/A";
		this.cylinders=0;
		this.owner = new person();
	}
	public  Vehicle(String name,int type,person p){
		this.manufactureName=name;
		this.cylinders=type;
		this.owner = p;
	}
	
	//accessor
	public String getManufactureName(){
		return this.manufactureName;
	}
	
	public int getCylinders(){
		return this.cylinders;
	}
	public person getOwner(){
		return this.owner;
	}
	//mutator
	
	public void setManufactureName(String name){
		this.manufactureName	=	name;
	}
	
	public void setCylinders(int type){
		this.cylinders		=		type;
	}
	public void setOwner(person p){
		this.owner	=	p;
	}
	
	public String toString(){
		System.out.println("The vehcle's manufacture'sname is "+this.getManufactureName());
		System.out.println("The vehcle's cylinder is "+this.getCylinders());
		System.out.println("The vehcle's owner  is "+this.getOwner().getName());
	
		return "123";
	}
	
	public boolean equals(Object object){
		if( object == null || getClass() != object.getClass() ) {
			
			System.out.println("Illegal parameter: " + " current class is " + getClass().getSimpleName() 
                                             + " and passed class is " + object.getClass().getSimpleName());
			return false;
		}
		
		Vehicle p = (Vehicle) object;
		
		if((this.getManufactureName().equals(p.manufactureName))&&(this.getCylinders()==p.getCylinders())&&(this.getOwner().equals(p.getOwner())))
		return true;
		
		return false;		
	}
	
}
