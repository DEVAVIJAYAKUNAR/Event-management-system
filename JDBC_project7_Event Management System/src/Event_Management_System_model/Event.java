package Event_Management_System_model;


import java.sql.Date;

public class Event {

    private int eventId;
    private String eventName;
    private String location;
    private Date eventDate;

    public int getEventId(){ return eventId; }
    public void setEventId(int eventId){ this.eventId=eventId; }

    public String getEventName(){ return eventName; }
    public void setEventName(String eventName){ this.eventName=eventName; }

    public String getLocation(){ return location; }
    public void setLocation(String location){ this.location=location; }

    public Date getEventDate(){ return eventDate; }
    public void setEventDate(Date eventDate){ this.eventDate=eventDate; }
}