package me.mushen.gungnir.result;

import lombok.Getter;
import lombok.ToString;

import java.util.Map;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-06-30
 */
@Getter
@ToString
public class MapResult<K, V> {
    // Result
    private Result result;

    private Map<K, V> valueMap;

    public MapResult(Result result) {
        this.result = result;
    }

    public MapResult(Map<K, V> valueMap) {
        this(Results.success(), valueMap);
    }

    public MapResult(Result result, Map<K, V> valueMap) {
        this.result = result;
        this.valueMap = valueMap;
    }
}
