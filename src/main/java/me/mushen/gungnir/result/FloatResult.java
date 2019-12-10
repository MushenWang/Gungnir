package me.mushen.gungnir.result;

/**
 * @Desc 带有float值的Result
 * @Author Mushen
 * @Create 2019-12-10
 */
public class FloatResult extends ComplexResult {
    /** float value */
    private final float value;

    private FloatResult(Result result, float value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的FloatResult, 并赋值
     * @param value
     * @return
     */
    public static FloatResult success(float value) {
        return of(Result.success(), value);
    }

    /**
     * 创建失败的FloatResult
     * @param result
     * @return
     */
    public static FloatResult failure(Result result) {
        return of(result, 0.0f);
    }

    /**
     * 创建FloatResult
     * @param result
     * @param value
     * @return
     */
    public static FloatResult of(Result result, float value) {
        return new FloatResult(result, value);
    }

    /**
     * 获取float值
     * @return
     */
    public float getValue() {
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
