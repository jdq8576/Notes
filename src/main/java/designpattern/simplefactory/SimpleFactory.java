package designpattern.simplefactory;

/**
 * @author tim
 * @date 2022/11/7 21:04
 */
public class SimpleFactory {

    public static Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else {
            return new ProductB();
        }
    }

    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.print();
    }
}

abstract class Product {
    abstract void print();
}

class ProductA extends Product {

    @Override
    void print() {
        System.out.println("产品A");
    }
}

class ProductB extends Product {

    @Override
    void print() {
        System.out.println("产品B");
    }
}
