package aha.oretama.jp.springbootfasttestdemo.repository.mybatis;

import java.util.Arrays;
import java.util.List;

import aha.oretama.jp.springbootfasttestdemo.model.CodeAndName;
import aha.oretama.jp.springbootfasttestdemo.repository.AreaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sekineyasufumi on 2017/11/16.
 */
@Repository
public class AreaMybatisRepository implements AreaRepository{
    @Override
    public List<CodeAndName> getPrefectures() {
        return Arrays.asList(new CodeAndName("SA01","東京都"),new CodeAndName("SA02","神奈川県"));
    }
}
