package me.mushen.gungnir.result;

/**
 * @Desc 标识成功与失败的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public class Result {
    /** 结果码: 成功(1), 失败(0) */
    private int code;

    /** 错误详情: 如果成功, 则该字段为null; 如果失败, 则该字段不为null */
    private Failure failure;

    public Result(int code) {
        this(code, null);
    }

    public Result(int code, Failure failure) {
        this.code = code;
        this.failure = failure;
    }

    public int getCode() {
        return code;
    }

    public Failure getFailure() {
        return failure;
    }

    @Override
    public String toString() {
        return "Result{" +
                (code == 1 ? "Success" : ("Failure: " + failure)) +
                '}';
    }
}
