package me.mushen.gungnir.result;

import lombok.Getter;
import lombok.ToString;

/**
 * @Desc
 * @Author Mushen
 * @Create 2018-06-30
 */
@Getter
@ToString
public class PojoResult<T> {
    // Result
    private Result result;

    private T value;

    public PojoResult(Result result) {
        this.result = result;
    }

    public PojoResult(T value) {
        this(Results.success(), value);
    }

    public PojoResult(Result result, T value) {
        this.result = result;
        this.value = value;
    }
}
