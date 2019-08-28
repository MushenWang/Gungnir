package me.mushen.gungnir.result;

import java.util.Collections;
import java.util.Map;

import static me.mushen.gungnir.util.CollectionUtil.nullToEmptyMap;

/**
 * @Desc 带有键值对的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class MapResult<K, V> extends ComplexResult {
    /** 键值对 */
    private Map<K, V> valueMap;

    private MapResult(Result result, Map<K, V> valueMap) {
        super(result);
        this.valueMap = valueMap;
    }

    /**
     * 创建成功的MapResult, 并赋值
     * @param map
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> MapResult<K, V> success(Map<K, V> map) {
        return new MapResult<>(Result.success(), map);
    }

    /**
     * 创建失败的MapResult
     * @param result
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> MapResult<K, V> failure(Result result) {
        return new MapResult<>(result, Collections.emptyMap());
    }

    /**
     * 创建CollectionResult
     * @param result
     * @param map
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> MapResult<K, V> result(Result result, Map<K, V> map) {
        return new MapResult<>(result, map);
    }

    /**
     * 获取键值对
     * @return
     */
    public Map<K, V> getValueMap() {
        return nullToEmptyMap(valueMap);
    }

    @Override
    public String toString() {
        return "MapResult{" +
                "result=" + result +
                ", valueMap=" + valueMap +
                '}';
    }
}
