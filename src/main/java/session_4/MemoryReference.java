package session_4;

public class MemoryReference {
    public static void main(String[] args) {
        String greeting1 = "Hello";
        String greeting2 = "Hello";

//        System.out.println(greeting1 == greeting2);
//        System.out.println(greeting1.equals(greeting2));

        User user1 = new User("John");
        User user2 = new User("John");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

    }
}




