package aha.oretama.jp.springbootfasttestdemo.repository;

import java.util.List;

import aha.oretama.jp.springbootfasttestdemo.model.CodeAndName;

/**
 * @author sekineyasufumi on 2017/11/16.
 */
public interface AreaRepository {
    List<CodeAndName> getPrefectures();
}
