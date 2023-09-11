package beans;

import java.util.Date;
import java.util.List;

public class Meeting {
    private Date date;
    private String location;
    private List<String> users;
    private String exchangeFormat;

    // 
    public Meeting(Date date, String location, List<String> users, String exchangeFormat) {
        this.date = date;
        this.location = location;
        this.users = users;
        this.exchangeFormat = exchangeFormat;
    }

    // 
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getParticipants() {
        return users;
    }

    public void setParticipants(List<String> users) {
        this.users = users;
    }

    public String getExchangeFormat() {
        return exchangeFormat;
    }

    public void setExchangeFormat(String exchangeFormat) {
        this.exchangeFormat = exchangeFormat;
    }

	public static Meeting createMeeting(User user1, User user2, String location2, String time) {
		// TODO Auto-generated method stub
		return null;
	}
}

