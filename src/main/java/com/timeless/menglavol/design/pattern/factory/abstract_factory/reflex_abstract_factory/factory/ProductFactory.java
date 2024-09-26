package com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.factory;

import com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.product.AbstractProductA;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.product.AbstractProductB;

import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @ClassName: ProductFactory
 * @Description: 产品工厂类
 * @Author: timeless
 * @Date: 2024/9/11
 */
public class ProductFactory {

    private static final Properties properties = new Properties();

    static {
        System.out.println("加载配置文件：src/main/resources/design/pattern/factory/reflex_abstract_factory/product.properties");
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(
                    "design/pattern/factory/reflex_abstract_factory/product.properties"
            ));
        } catch (Exception e) {
            System.out.println(
                    "加载配置文件：src/main/resources/design/pattern/factory/reflex_abstract_factory/product.properties 出错！"
            );
        }
    }

    // A or B
    private String productType;

    // 1 or 2
    private String number;

    public ProductFactory() {
    }

    public ProductFactory(String productType, String number) {
        this.productType = productType;
        this.number = number;
    }

    public AbstractProductA createProductA() throws Exception {
        if (productType != null && number != null){
            Class<? extends AbstractProductA> clazz = (Class<? extends AbstractProductA>) Class.forName(
                    properties.getProperty("product" + productType + number)
            );
            if (clazz != null){
                Constructor<? extends AbstractProductA> constructor = clazz.getConstructor();
                if (constructor != null){
                    return constructor.newInstance();
                }
            }
        }
        return null;
    }

    public AbstractProductB createProductB() throws Exception {
        if (productType != null && number != null){
            Class<? extends AbstractProductB> clazz = (Class<? extends AbstractProductB>) Class.forName(
                    properties.getProperty("product" + productType + number)
            );
            if (clazz != null){
                Constructor<? extends AbstractProductB> constructor = clazz.getConstructor();
                if (constructor != null){
                    return constructor.newInstance();
                }
            }
        }
        return null;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
