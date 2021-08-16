package principal;
import jakarta.persistence.*;

@Entity
public class User {
	
	@Column
	@Id
	private int id;
	
	public void setId(int i) {
		this.id = i;
	}
	
	public long getId() {
		return this.id;
	}
	
}
