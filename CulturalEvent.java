class CulturalEvent extends Event {
    private String theme;
    private String chiefGuest;

    public CulturalEvent(int eventID, String eventName, String eventDate, String theme, String chiefGuest) {
        super(eventID, eventName, eventDate);
        this.theme = theme;
        this.chiefGuest = chiefGuest;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getChiefGuest() {
        return chiefGuest;
    }

    public void setChiefGuest(String chiefGuest) {
        this.chiefGuest = chiefGuest;
    }

    @Override
    public String toString() {
        return super.toString() + ", Theme: " + theme + ", Chief Guest: " + chiefGuest;
    }
}