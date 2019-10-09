package smallword.model;


//STEP 2.2: Create basic class with constructors and getters and setters
public class Room {

    private int id;
    private String roomName;
    private String roomNumber;
    private String roomType;

    public Room() {
        super();
    }

    public Room(int id, String roomName, String roomNumber, String roomType) {
        this.id = id;
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}

