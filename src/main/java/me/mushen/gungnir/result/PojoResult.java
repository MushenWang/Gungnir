package me.mushen.gungnir.result;

/**
 * @Desc 带有实体的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public class PojoResult<T> {
    /** Result */
    private Result result;

    /** 实体 */
    private T value;

    public PojoResult(Result result) {
        this.result = result;
    }

    public PojoResult(T value) {
        this(Result.success(), value);
    }

    public PojoResult(Result result, T value) {
        this.result = result;
        this.value = value;
    }

    public Result getResult() {
        return result;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PojoResult{" +
                "result=" + result +
                ", value=" + value +
                '}';
    }
}
