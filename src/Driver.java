import dev.rehm.User;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {
        User u1 = new User(1,"Sally", "sally@gmail.com");
        User u2 = new User(1,"Sally", "sally@gmail.com");
        User u3 = new User(5,"Joe", "joe@gmail.com");

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());

        System.out.println(u1.equals(u2));


        Map<User, Integer> scores = new HashMap<>();
        scores.put(u1, 3000);
        scores.put(u2, 2000);

    }
}
