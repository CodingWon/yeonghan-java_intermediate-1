package ch1_obj_class.ex2_equals;

public class Main {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
