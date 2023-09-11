package beans;

public class MeetingFacade {
	
     public MeetingFacade() {
		
	}

     public MeetingFacade(User user1, User user2,Meeting meeting) {
		
	}

	public static void scheduleMeeting(User user1, User user2, String location, String time) {
        Meeting meeting = Meeting.createMeeting(user1, user2, location, time);
       user1.addMeeting(meeting);
       user2.addMeeting(meeting);
    }
}
