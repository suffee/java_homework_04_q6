package person;
public class person {
	
	private String name;
	
		public person(){
			this.name="N/A";		
		}
	
		public person(String name){
			this.name=name;		
		}
		public person(person theObject){
			this.name=theObject.name;		
		}
		//accessor
		public String getName(){
			return this.name;
		}
		//mutator
		public void setName(String name){
			this.name	=	name;
		}
		public String toString(){
			return "My name is "+this.name;
		}
		public boolean equals(Object object){		
			if( object == null || getClass() != object.getClass() ) {
			
			System.out.println("Illegal parameter: " + " current class is " + getClass().getSimpleName() 
                                             + " and passed class is " + object.getClass().getSimpleName());
			return false;
		}
		
		person p = (person) object;
		return this.name.equals(p.name);
	}
}
