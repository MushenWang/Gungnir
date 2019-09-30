package me.mushen.gungnir.result;

import java.util.Collections;
import java.util.Map;

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
        return of(Result.success(), map);
    }

    /**
     * 创建失败的MapResult
     * @param result
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> MapResult<K, V> failure(Result result) {
        return of(result, null);
    }

    /**
     * 创建CollectionResult
     * @param result
     * @param valueMap
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> MapResult<K, V> of(Result result, Map<K, V> valueMap) {
        return new MapResult<>(result, valueMap);
    }

    /**
     * 获取键值对
     * @return
     */
    public Map<K, V> getValueMap() {
        return valueMap == null ? Collections.emptyMap() : valueMap;
    }

    /**
     * 容量
     * @return
     */
    public int size() {
        return valueMap == null ? 0 : valueMap.size();
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        return  '{' +
                "result=" + result +
                ", map=" + valueMap +
                '}';
    }
}
