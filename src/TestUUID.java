import java.util.UUID;

public class TestUUID {
    public static void main(String[] args) {

        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.randomUUID();
        UUID uuid4 = UUID.randomUUID();

        // remember it is the string you want
        String uuid1str = uuid1.toString();
        String uuid2str = uuid2.toString();
        String uuid3str = uuid3.toString();
        String uuid4str = uuid4.toString();

        System.out.println(uuid1str);
        System.out.println(uuid2str);
        System.out.println(uuid3str);
        System.out.println(uuid4str);
    }
}
