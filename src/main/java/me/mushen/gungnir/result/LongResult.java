package me.mushen.gungnir.result;

/**
 * @Desc 带有long值的Result
 * @Author Mushen
 * @Create 2019-12-10
 */
public class LongResult extends ComplexResult {
    /** long value */
    private final long value;

    private LongResult(Result result, long value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的LongResult, 并赋值
     * @param value
     * @return
     */
    public static LongResult success(long value) {
        return of(Result.success(), value);
    }

    /**
     * 创建失败的LongResult
     * @param result
     * @return
     */
    public static LongResult failure(Result result) {
        return of(result, 0L);
    }

    /**
     * 创建LongResult
     * @param result
     * @param value
     * @return
     */
    public static LongResult of(Result result, long value) {
        return new LongResult(result, value);
    }

    /**
     * 获取long值
     * @return
     */
    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  '{' +
                "result=" + result +
                ", value=" + value +
                '}';
    }
}
