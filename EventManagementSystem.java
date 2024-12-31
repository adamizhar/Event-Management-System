import java.util.Scanner;


public class EventManagementSystem {
    private static Event[] events = new Event[100];
    private static int eventCount = 0;

    public static void addEvent(Event event) {
        if (eventCount < events.length) {
            events[eventCount++] = event;
            System.out.println("\nEvent added successfully!");
        } else {
            System.out.println("Event list is full!");
        }
    }

    public static void deleteEvent(int eventID) { //pening nak explain 
        for (int i = 0; i < eventCount; i++) {
            if (events[i].getEventID() == eventID) {
                events[i] = events[--eventCount];
                events[eventCount] = null;
                System.out.println("Event deleted successfully!");
                return;
            }
        }
        System.out.println("Event not found!");
    }

    public static void updateEvent(int eventID, Event updatedEvent) {
        for (int i = 0; i < eventCount; i++) {
            if (events[i].getEventID() == eventID) {
                events[i] = updatedEvent;
                System.out.println("Event updated successfully!");
                return;
            }
        }
        System.out.println("Event not found!");
    }

    public static void listEvents() {
        if (eventCount == 0) {
            System.out.println("\nThe list is empty");
            System.out.println("Please add event into the list");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            return;
        }
        for (int i = 0; i < eventCount; i++) {
            System.out.println(events[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n----------Event Management System----------");
            System.out.println("1. Add Event");
            System.out.println("2. Delete Event");
            System.out.println("3. Update Event");
            System.out.println("4. List Events");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter event type (Academic/Cultural): ");
                    String type = scanner.nextLine();
                    System.out.print("\nEnter Event ID: ");
                    int eventID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("\nEnter Event Name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("\nEnter Event Date (YYYY-MM-DD): ");
                    String eventDate = scanner.nextLine();

                    if (type.equalsIgnoreCase("Academic")) {
                        System.out.print("\nEnter Speaker Name: ");
                        String speakerName = scanner.nextLine();
                        System.out.print("\nEnter Topic: ");
                        String topic = scanner.nextLine();
                        addEvent(new AcademicEvent(eventID, eventName, eventDate, speakerName, topic));
                    } else if (type.equalsIgnoreCase("Cultural")) {
                        System.out.print("\nEnter Theme: ");
                        String theme = scanner.nextLine();
                        System.out.print("\nEnter Chief Guest: ");
                        String chiefGuest = scanner.nextLine();
                        addEvent(new CulturalEvent(eventID, eventName, eventDate, theme, chiefGuest));
                    } else {
                        System.out.println("Invalid event type!");
                    }
                    break;
                case 2:
                    System.out.print("Enter Event ID to delete: ");
                    int deleteID = scanner.nextInt();
                    deleteEvent(deleteID);
                    break;
                    case 3:
                    System.out.print("Enter Event ID to update: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Event Name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter Event Date (YYYY-MM-DD): ");
                    String updatedDate = scanner.nextLine();
                    System.out.print("Enter event type (Academic/Cultural): ");
                    String updateType = scanner.nextLine();

                    if (updateType.equalsIgnoreCase("Academic")) {
                        System.out.print("Enter Speaker Name: ");
                        String updatedSpeaker = scanner.nextLine();
                        System.out.print("Enter Topic: ");
                        String updatedTopic = scanner.nextLine();
                        updateEvent(updateID, new AcademicEvent(updateID, updatedName, updatedDate, updatedSpeaker, updatedTopic));
                    } else if (updateType.equalsIgnoreCase("Cultural")) {
                        System.out.print("Enter Theme: ");
                        String updatedTheme = scanner.nextLine();
                        System.out.print("Enter Chief Guest: ");
                        String updatedGuest = scanner.nextLine();
                        updateEvent(updateID, new CulturalEvent(updateID, updatedName, updatedDate, updatedTheme, updatedGuest));
                    } else {
                        System.out.println("Invalid event type!");
                    }
                    break;
                case 4:
                    System.out.println("\n");
                    listEvents();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}