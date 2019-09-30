package me.mushen.gungnir.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

/**
 * @Desc 带有集合的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public class CollectionResult<T> extends ComplexResult {
    /** 集合数据 */
    protected Collection<T> values;

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
    public static <T> CollectionResult<T> success(@Nonnull T value) {
        return success(Collections.singletonList(value));
    }

    /**
     * 创建成功的CollectionResult, 并赋值
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> success(Collection<T> coll) {
        return of(Result.success(), coll);
    }

    /**
     * 创建失败的CollectionResult
     * @param result
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> failure(Result result) {
        return of(result, null);
    }

    /**
     * 创建CollectionResult
     * @param result
     * @param value
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> of(Result result, @Nonnull T value) {
        return of(result, Collections.singletonList(value));
    }

    /**
     * 创建CollectionResult
     * @param result
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> CollectionResult<T> of(Result result, Collection<T> coll) {
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
        return values == null ? Collections.emptyList() : new ArrayList<>(values);
    }

    /**
     * 将集合以Set的方式返回
     * @return
     */
    public Set<T> getValueAsSet() {
        return values == null ? Collections.emptySet() : new HashSet<>(values);
    }

    /**
     * 容量
     * @return
     */
    public int size() {
        return values == null ? 0 : values.size();
    }

    /**
     * 是否不包含任何元素
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        return  '{' +
                "result=" + result +
                ", collection=" + values +
                '}';
    }
}
