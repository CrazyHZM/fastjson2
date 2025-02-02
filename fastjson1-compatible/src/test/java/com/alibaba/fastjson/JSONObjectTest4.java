package com.alibaba.fastjson;

import com.alibaba.fastjson.annotation.JSONField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JSONObjectTest4 {
    // GraalVM not support
    // Android not support
    @Test
    public void test_interface() {
        VO vo = JSON.parseObject("{\"id\":123}", VO.class);
        assertEquals(123, vo.getId());
    }

    public interface VO {
        @JSONField
        int getId();

        @JSONField
        void setId(int val);
    }
}
