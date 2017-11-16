package aha.oretama.jp.springbootfasttestdemo.service;

import java.util.List;

import aha.oretama.jp.springbootfasttestdemo.model.CodeAndName;
import aha.oretama.jp.springbootfasttestdemo.repository.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author sekineyasufumi on 2017/11/16.
 */
@Service
@RequiredArgsConstructor
public class AreaService {

    private final AreaRepository areaRepository;

    public List<CodeAndName> getPrefectures() {
        List<CodeAndName> prefectures = areaRepository.getPrefectures();

        // Here are business logic.
        if(prefectures.isEmpty()) {
            prefectures.add(new CodeAndName("SA01", "東京"));
        }

        return prefectures;
    }
}
