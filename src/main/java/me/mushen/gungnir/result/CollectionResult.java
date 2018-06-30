package me.mushen.gungnir.result;

import lombok.Getter;
import lombok.ToString;

import java.util.Collection;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-06-30
 */
@Getter
@ToString
public class CollectionResult<T> {
    // Result
    private Result result;

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
}
