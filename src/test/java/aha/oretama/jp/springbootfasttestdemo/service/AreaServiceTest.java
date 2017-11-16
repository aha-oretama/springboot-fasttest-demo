package aha.oretama.jp.springbootfasttestdemo.service;

import static org.junit.Assert.*;

import java.util.List;

import aha.oretama.jp.springbootfasttestdemo.MyTestConfiguration;
import aha.oretama.jp.springbootfasttestdemo.model.CodeAndName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sekineyasufumi on 2017/11/16.
 */
@RunWith(SpringRunner.class)
@TestConfiguration()
@Import(MyTestConfiguration.class)
public class AreaServiceTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void test() throws Exception {
        List<CodeAndName> prefectures = areaService.getPrefectures();

        assertEquals(prefectures.get(0).getCode(), "SA01");
        assertEquals(prefectures.get(0).getName(), "東京都");
        assertEquals(prefectures.get(1).getCode(), "SA02");
    }
}
