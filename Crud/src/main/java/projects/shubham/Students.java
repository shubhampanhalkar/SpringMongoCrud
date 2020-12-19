package projects.shubham;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Students {

	int id;
	String name;
	String city;
	
	public Students() {
		
	}
	
    public Students(int id,String name,String city) {
		
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student[id = "+ id +", Name = " + name +", City = "+ city + "]";
	}
	
}
