package work02;
public class FriendList {
    private final String friend;
    private FriendList next;

    private FriendList(String friend) {
        this.friend = friend;
    }

    public static FriendList newList() {
        return new FriendList(" ");
    }

    public boolean addFriend(String friend) {
        if (friend == null || friend.isBlank()) return false;
        var current = this;
        while (current.next != null) {
            current = current.next;
            if (current.friend.equals(friend)) return false;
        }
        current.next = new FriendList(friend);
        return true;
    }

    @Override
    public String toString(){
        var current = this.next;
        if ( current == null) return "";
        var s = new StringBuilder();
        s.append(current.friend);
        while ((current = current.next) != null){
            s.append(", ") .append(current.friend);
        }
        return s.toString();
    }
}

