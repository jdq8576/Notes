package designpattern.factory.practice;

/**
 * @author tim
 * @date 2022/9/6 9:12 下午
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T create(Class<T> tClass) {
        Product product = null;
        try {
            product = (Product) Class.forName(tClass.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
