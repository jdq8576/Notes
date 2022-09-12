package proxy.jdk;

/**
 * @author tim
 * @date 2022/9/6 9:27 下午
 */
public interface UserService {
    public boolean login(String username, String password);

    public boolean register(String username, String password);
}
