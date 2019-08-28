package me.mushen.gungnir.result;

import javax.annotation.Nonnull;

/**
 * @Desc 标识成功与失败的Result
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class Result implements Success {
    /** 错误的结果码(0) */
    private final static int FAIL_CODE = 0;
    /** 成功的结果码(1) */
    private final static int SUCC_CODE = 1;

    /** 结果码: 成功(1), 失败(0) */
    private final int code;

    /** 错误详情: 如果成功, 则该字段为null; 如果失败, 则该字段不为null */
    private final Failure failure;

    private Result(int code) {
        this(code, null);
    }

    private Result(int code, Failure failure) {
        this.code = code;
        this.failure = failure;
    }

    /**
     * 创建标识成功的Result
     * @return
     */
    public static Result success() {
        return new Result(SUCC_CODE);
    }

    /**
     * 创建标识失败的Result
     * @param failure 错误详情
     * @return
     */
    public static Result failure(@Nonnull Failure failure) {
        return new Result(FAIL_CODE, failure);
    }

    /**
     * 创建标识失败的Result
     * @param throwable 异常栈
     * @return
     */
    public static Result failure(@Nonnull Throwable throwable) {
        return failure(Failure.of(throwable));
    }

    /**
     * 创建标识失败的Result
     * @param failDesc 错误详情
     * @return
     */
    public static Result failure(@Nonnull String failDesc) {
        return failure(Failure.of(failDesc));
    }

    /**
     * 获取是否成功的Result
     * @return
     */
    @Override
    public boolean isSuccess() {
        return code == SUCC_CODE;
    }

    /**
     * 获取结果码: 成功(1), 失败(0)
     * @return
     */
    public int getCode() {
        return code;
    }

    /**
     * 获取错误详情, 如果成功, 则为空
     * @return
     */
    public Failure getFailure() {
        return failure;
    }

    @Override
    public String toString() {
        return "Result{" +
                (code == SUCC_CODE ? "SUCCESS" : "FAILURE: " + getFailure()) +
                '}';
    }
}
