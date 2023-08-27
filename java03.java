class Room {
    int roomno;
    String roomtype;
    double roomarea;

    void setData(int roomno, String roomtype, double roomarea) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
    }

    void displayData() {
        System.out.println("Room Number: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea);
    }
}

public class Main {
    public static void main(String[] args) {
        Room roomInstance = new Room();
        roomInstance.setData(101, "non-ac", 300.0);
        roomInstance.displayData();
    }
}
