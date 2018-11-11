package com.doom.lucifer.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58ganji.com">doom</a>
 */
public class BufferedReaderHandler {

    //2.执行函数式接口定义的行为，具体行为由调用时的Lambda表达式实现
    private static String processFile(BufferedReaderProcessor p) throws IOException {
        //java7中的带资源的try语句，简化了代码，不需要显示的关闭资源了
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/zhengguoqiang/Downloads/data.txt"))) {
            //处理BufferedReader对象
            return p.process(br);
        }
    }


    public static void main(String[] args) throws Exception {
        //3.传递Lambda
        String s = processFile((BufferedReader br) -> br.readLine() + "\n" + br.readLine());
        System.out.println(s);
    }
}
