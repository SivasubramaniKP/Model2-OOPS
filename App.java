import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.userName = "Los Santos";
        user.password = "()=>{return(password)}";
        user.sayHello();
        FileOutputStream fout = new FileOutputStream("objectData.ser");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(user);
        out.close();
        fout.close();
        System.out.println("Data successfully written");
    }
}
