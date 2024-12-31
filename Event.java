
class Event {
    protected int eventID;
    protected String eventName;
    protected String eventDate;

    public Event(int eventID, String eventName, String eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "EventID: " + eventID + ", Name: " + eventName + ", Date: " + eventDate;
    }
}