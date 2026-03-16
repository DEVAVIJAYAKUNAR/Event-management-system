package Event_Management_System_model;


public class Registration {

    private int regId;
    private int userId;
    private int eventId;

    public int getRegId(){ return regId; }
    public void setRegId(int regId){ this.regId=regId; }

    public int getUserId(){ return userId; }
    public void setUserId(int userId){ this.userId=userId; }

    public int getEventId(){ return eventId; }
    public void setEventId(int eventId){ this.eventId=eventId; }
}