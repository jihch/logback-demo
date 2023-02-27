package io.github.jihch;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    // 快速入门
    @Test
    public void test() {
        for (int i = 0; i < 10000; i++) {
            // 日志输出
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");
            LOGGER.trace("trace");
        }
    }

}
