class AcademicEvent extends Event {
    private String speakerName;
    private String topic;

    public AcademicEvent(int eventID, String eventName, String eventDate, String speakerName, String topic) {
        super(eventID, eventName, eventDate);
        this.speakerName = speakerName;
        this.topic = topic;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Speaker: " + speakerName + ", Topic: " + topic;
    }
}