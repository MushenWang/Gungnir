package me.mushen.gungnir.result;

/**
 * @Desc 带有int值的Result
 * @Author Mushen
 * @Create 2019-12-10
 */
public class IntResult extends ComplexResult {
    /** int value */
    private final int value;

    private IntResult(Result result, int value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的IntResult, 并赋值
     * @param value
     * @return
     */
    public static IntResult success(int value) {
        return of(Result.success(), value);
    }

    /**
     * 创建失败的IntResult
     * @param result
     * @return
     */
    public static IntResult failure(Result result) {
        return of(result, 0);
    }

    /**
     * 创建IntResult
     * @param result
     * @param value
     * @return
     */
    public static IntResult of(Result result, int value) {
        return new IntResult(result, value);
    }

    /**
     * 获取int值
     * @return
     */
    public int getValue() {
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
