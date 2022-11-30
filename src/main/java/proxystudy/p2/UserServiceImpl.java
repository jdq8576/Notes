package proxystudy.p2;

/**
 * @author tim
 * @date 2022/11/30 20:25
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login(String loginName, String passWord) throws InterruptedException {
        if ("admin".equals(loginName) && "123456".equals(passWord)) {
            System.out.println("您登录成功，欢迎光临本系统！");
        } else {
            System.out.println("您登录失败，用户名或密码错误~");
        }
        Thread.sleep(1000);
    }

    @Override
    public void deleteUsers() throws InterruptedException {
        System.out.println("成功删除了1万个用户～");
        Thread.sleep(1500);
    }

    @Override
    public String[] selectUsers() throws InterruptedException {
        System.out.println("查询出了3个用户");
        String[] names = {"张全蛋", "李二狗", "牛爱花"};

        Thread.sleep(500);
        return names;
    }
}