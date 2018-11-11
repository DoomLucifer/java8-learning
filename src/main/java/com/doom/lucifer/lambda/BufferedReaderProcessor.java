package com.doom.lucifer.lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 1.定义函数式接口来传递行为
 *
 * @author <a href="mailto:zhengguoqiang@58ganji.com">doom</a>
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    //只定义一个抽象方法
    String process(BufferedReader b) throws IOException;
}
