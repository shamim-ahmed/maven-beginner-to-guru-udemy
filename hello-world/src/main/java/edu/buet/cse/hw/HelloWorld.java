package edu.buet.cse.hw;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author shamim
 */
public class HelloWorld {

    public static void main(String[] args) {
        var message = "Hello World!";
        System.out.println(message);
        System.out.println(StringUtils.upperCase(message));
    }
}
