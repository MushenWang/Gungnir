package me.mushen.gungnir.result;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static me.mushen.gungnir.util.CollectionUtil.nullToEmptyList;
import static me.mushen.gungnir.util.CollectionUtil.nullToEmptySet;

/**
 * @Desc 带有集合的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public class CollectionResult<T> extends ComplexResult {
    /** 集合数据 */
    private Collection<T> values;

    protected CollectionResult(Result result) {
        this(result, null);
    }

    protected CollectionResult(Collection<T> values) {
        this(Result.success(), values);
    }

    protected CollectionResult(Result result, Collection<T> values) {
        super(result);
        this.values = values;
    }

    /**
     * 创建成功的CollectionResult, 并赋值
     * @param value
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> success(T value) {
        return success(Collections.singletonList(value));
    }

    /**
     * 创建成功的CollectionResult, 并赋值
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> success(Collection<T> coll) {
        return new CollectionResult<>(coll);
    }

    /**
     * 创建失败的CollectionResult
     * @param result
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> failure(Result result) {
        return new CollectionResult<>(result);
    }

    /**
     * 创建CollectionResult
     * @param result
     * @param value
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> result(Result result, T value) {
        return result(result, Collections.singletonList(value));
    }

    /**
     * 创建CollectionResult
     * @param result
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> result(Result result, Collection<T> coll) {
        return new CollectionResult<>(result, coll);
    }

    /**
     * 返回集合
     * @return
     */
    public Collection<T> getValues() {
        return values == null ? Collections.emptyList() : values;
    }

    /**
     * 将集合以List的方式返回
     * @return
     */
    public List<T> getValueAsList() {
        return nullToEmptyList(values);
    }

    /**
     * 将集合以Set的方式返回
     * @return
     */
    public Set<T> getValueAsSet() {
        return nullToEmptySet(values);
    }

    @Override
    public String toString() {
        return "CollectionResult{" +
                "result=" + result +
                ", values=" + values +
                '}';
    }
}
