package beans;

public class matchUser {
	private int id;
	private String userId;
	
	
	public matchUser() {
		super();
	}
	
	
	public matchUser(String userId) {
		super();
		this.userId = userId;
	}


	public matchUser(int id, String userId) {
		super();
		this.id = id;
		this.userId = userId;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
