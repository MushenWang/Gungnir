package me.mushen.gungnir.result;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc 带有键值对的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public class MapResult<K, V> {
    /** Result */
    private Result result;

    /** 键值对 */
    private Map<K, V> valueMap;

    public MapResult(Result result) {
        this.result = result;
    }

    public MapResult(Map<K, V> valueMap) {
        this(Result.success(), valueMap);
    }

    public MapResult(Result result, Map<K, V> valueMap) {
        this.result = result;
        this.valueMap = valueMap;
    }

    public Result getResult() {
        return result;
    }

    public Map<K, V> getValueMap() {
        return valueMap == null ? new HashMap<>() : valueMap;
    }

    @Override
    public String toString() {
        return "MapResult{" +
                "result=" + result +
                ", valueMap=" + valueMap +
                '}';
    }
}
