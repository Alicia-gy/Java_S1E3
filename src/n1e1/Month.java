package n1e1;

public class Month {
	
	private String name;
	
	public Month (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object object) {
		
		if (object == null) return false;
		
		Month item = (Month) object;
		if(this.getName().equals(item.getName())) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}

}
