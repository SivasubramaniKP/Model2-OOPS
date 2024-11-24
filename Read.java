import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Read implements Serializable {
    public static void main(String[] args) throws Exception {
        User u = null;
        FileInputStream fin = new FileInputStream("objectData.ser");
        ObjectInputStream in = new ObjectInputStream(fin);
        u = (User)in.readObject();
        System.out.println(u.userName);
        System.out.println(u.password);
        in.close();
        fin.close();

    }
}