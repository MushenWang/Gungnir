package me.mushen.gungnir.result;

/**
 * @Desc 带有实体的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class PojoResult<T> extends ComplexResult {
    /** Java POJO */
    private final T value;

    private PojoResult(Result result) {
        this(result, null);
    }

    private PojoResult(T value) {
        this(Result.success(), value);
    }

    private PojoResult(Result result, T value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的PojoResult, 并赋值
     * @param value
     * @param <T>
     * @return
     */
    public static <T> PojoResult<T> success(T value) {
        return new PojoResult<>(value);
    }

    /**
     * 创建失败的PojoResult
     * @param result
     * @param <T>
     * @return
     */
    public static <T> PojoResult<T> failure(Result result) {
        return new PojoResult<>(result);
    }

    /**
     * 创建PojoResult
     * @param result
     * @param value
     * @param <T>
     * @return
     */
    public static <T> PojoResult<T> result(Result result, T value) {
        return new PojoResult<>(result, value);
    }

    /**
     * 获取Java POJO实例
     * @return
     */
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
