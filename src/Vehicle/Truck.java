package Vehicle;

import person.person;

public class Truck extends Vehicle {
	
	private double loadCabability;
	private int towingCabability;
	
		public Truck(){
			super();
			this.loadCabability=0;
			this.towingCabability=0;
		}
		public Truck(String name,int type,person p,double ton,int pound){
			super(name,type,p);
			this.loadCabability=ton;
			this.towingCabability=pound;		
		}
		
		//accessor
		public double getLoadCabability(){
			return this.loadCabability;
		}
		public int getTowingCabability(){
			return this.towingCabability;
		}
		//mutator
		public void setLoadCabability(double tons){
			this.loadCabability = tons;
		}
		public void setTowingCabability(int pounds){
			this.towingCabability=pounds;
		}
		

		public String toString(){
			super.toString();
			System.out.println("The vehcle's loadingcabability is "+this.getLoadCabability());
			System.out.println("The vehcle's towingcabability is "+this.getTowingCabability());
			return "123";
		}
		
		public boolean equals(Object object){
			if( object == null || getClass() != object.getClass() ) {
				
				System.out.println("Illegal parameter: " + " current class is " + getClass().getSimpleName() 
	                                             + " and passed class is " + object.getClass().getSimpleName());
				return false;
			}
			
			Truck t = (Truck) object;
			
			if((super.equals(t))&&(this.getTowingCabability()==t.getTowingCabability())&&(this.getLoadCabability()==t.getLoadCabability()))
			return true;
		
			return false;		
		}
}
