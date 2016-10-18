package org.spring.ekram;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by ekram on 10/17/2016.
 */
public class Drawing {
    public static void main(String [] args){
    BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle triangle=(Triangle) factory.getBean("Triangle");
        triangle.draw();

    }
}
