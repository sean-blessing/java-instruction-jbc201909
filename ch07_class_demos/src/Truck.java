
public class Truck {
	private int id;

	public Truck() {
		super();
	}

	public Truck(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + "]";
	}
	
	
}
