package beans;

public class User {
	private int id;
	private String userName;
	private String password;
    private String email;
    private String skillHave;
    private String skillWant;
	private Meeting meeting;
	   
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public User(int id, String userName, String password, String email, String skillHave, String skillWant) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.skillHave = skillHave;
		this.skillWant = skillWant;
	}

	public User(int id, String userName, String password, String email, String skillHave, String skillWant,
			Meeting meeting) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.skillHave = skillHave;
		this.skillWant = skillWant;
		this.meeting = meeting;
	}

	public User(String userName, String password, String email, String skillHave, String skillWant) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.skillHave = skillHave;
		this.skillWant = skillWant;
	}

	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkillHave() {
		return skillHave;
	}
	public void setSkillHave(String skillHave) {
		this.skillHave = skillHave;
	}
	public String getSkillWant() {
		return skillWant;
	}
	public void setSkillWant(String skillWant) {
		this.skillWant = skillWant;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void addMeeting(Meeting meeting) {
		this.setMeeting(meeting);
	}
	public Meeting getMeeting() {
		return meeting;
	}
	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}
	
	 @Override
	    public String toString() {
	        return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + ""
	        		+ ", skillHave=" + skillHave +", skillWant=" + skillWant+ "]";
	    }
	
}
