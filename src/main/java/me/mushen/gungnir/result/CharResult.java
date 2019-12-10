package me.mushen.gungnir.result;

/**
 * @Desc 带有char返回值的Result
 * @Author Mushen
 * @Create 2019-12-10
 */
public class CharResult extends ComplexResult {
    /** char value */
    private final char value;

    private CharResult(Result result, char value) {
        super(result);
        this.value = value;
    }

    /**
     * 创建成功的CharResult, 并赋值
     * @param value
     * @return
     */
    public static CharResult success(char value) {
        return of(Result.success(), value);
    }

    /**
     * 创建失败的CharResult
     * @param result
     * @return
     */
    public static CharResult failure(Result result) {
        return of(result, Character.MIN_VALUE);
    }

    /**
     * 创建CharResult
     * @param result
     * @param value
     * @return
     */
    public static CharResult of(Result result, char value) {
        return new CharResult(result, value);
    }

    /**
     * 获取char值
     * @return
     */
    public char getValue() {
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
