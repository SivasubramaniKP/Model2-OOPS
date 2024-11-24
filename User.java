import java.io.Serializable;

public class User implements Serializable {
    String userName;
    String password;

    void sayHello () {
        System.out.println("HI " + userName);
    }

}
