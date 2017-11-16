package aha.oretama.jp.springbootfasttestdemo.controller;

import java.util.List;

import aha.oretama.jp.springbootfasttestdemo.model.CodeAndName;
import aha.oretama.jp.springbootfasttestdemo.service.AreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sekineyasufumi on 2017/11/16.
 */
@RestController
@RequiredArgsConstructor
public class AreaController {

    private final AreaService areaService;

    @GetMapping("prefectures")
    public List<CodeAndName> getPrefectures() {
        return areaService.getPrefectures();
    }

}
