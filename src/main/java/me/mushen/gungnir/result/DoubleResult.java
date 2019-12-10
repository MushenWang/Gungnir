package me.mushen.gungnir.result;

/**
 * @Desc 带有double值的Result
 * @Author Mushen
 * @Create 2019-12-10
 */
public class DoubleResult extends ComplexResult {
    /** double value */
    private final double value;

    private DoubleResult(Result result, double value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的DoubleResult, 并赋值
     * @param value
     * @return
     */
    public static DoubleResult success(double value) {
        return of(Result.success(), value);
    }

    /**
     * 创建失败的DoubleResult
     * @param result
     * @return
     */
    public static DoubleResult failure(Result result) {
        return of(result, 0.0);
    }

    /**
     * 创建DoubleResult
     * @param result
     * @param value
     * @return
     */
    public static DoubleResult of(Result result, double value) {
        return new DoubleResult(result, value);
    }

    /**
     * 获取double值
     * @return
     */
    public double getValue() {
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
