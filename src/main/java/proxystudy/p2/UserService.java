package proxystudy.p2;

/**
 * @author tim
 * @date 2022/11/30 20:24
 */
public interface UserService {
    public void login(String loginName, String passWord) throws InterruptedException;

    public void deleteUsers() throws InterruptedException;

    public String[] selectUsers() throws InterruptedException;
}
