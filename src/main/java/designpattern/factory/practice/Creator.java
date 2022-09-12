package designpattern.factory.practice;

/**
 * @author tim
 * @date 2022/9/6 9:12 下午
 */
public abstract class Creator {
    public abstract <T extends Product> T create(Class<T> tClass);
}
