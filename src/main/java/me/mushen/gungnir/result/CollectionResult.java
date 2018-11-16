package me.mushen.gungnir.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Desc 带有集合的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public class CollectionResult<T> {
    /** Result */
    private Result result;

    /** 集合数据 */
    private Collection<T> values;

    public CollectionResult(Result result) {
        this.result = result;
    }

    public CollectionResult(Collection<T> values) {
        this(Results.success(), values);
    }

    public CollectionResult(Result result, Collection<T> values) {
        this.result = result;
        this.values = values;
    }

    /**
     * 将集合以链表的方式返回
     * @return
     */
    public List<T> getValueAsList() {
        return values == null ? new ArrayList<>() : new ArrayList<>(values);
    }

    public Result getResult() {
        return result;
    }

    public Collection<T> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "CollectionResult{" +
                "result=" + result +
                ", values=" + values +
                '}';
    }
}
