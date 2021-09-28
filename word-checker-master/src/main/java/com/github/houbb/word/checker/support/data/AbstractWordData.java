package com.github.houbb.word.checker.support.data;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <p> project: word-checker-AbstractWordData </p>
 * <p> create on 2020/2/8 17:46 </p>
 *
 * @author Administrator
 * @since 0.0.5
 */
public class AbstractWordData implements IWordData {

    @Override
    public Map<String, Integer> freqData() {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, List<String>> correctData() {
        return Collections.emptyMap();
    }
}
