package me.mushen.gungnir.result;

/**
 * @Desc 带有boolean值的Result
 * @Author Mushen
 * @Create 2019-12-10
 */
public class BoolResult extends ComplexResult {
    /** boolean value */
    private final boolean value;

    private BoolResult(Result result, boolean value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的BoolResult, 并赋值
     * @param value
     * @return
     */
    public static BoolResult success(boolean value) {
        return of(Result.success(), value);
    }

    /**
     * 创建失败的BoolResult
     * @param result
     * @return
     */
    public static BoolResult failure(Result result) {
        return of(result, false);
    }

    /**
     * 创建BoolResult
     * @param result
     * @param value
     * @return
     */
    public static BoolResult of(Result result, boolean value) {
        return new BoolResult(result, value);
    }

    /**
     * 获取boolean值
     * @return
     */
    public boolean getValue() {
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
