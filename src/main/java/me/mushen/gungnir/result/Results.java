package me.mushen.gungnir.result;

import javax.annotation.Nonnull;

/**
 * @Desc Result的工具类
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class Results {
    /** Failure Result Code */
    private static final int FAIL_CODE = 0;
    /** Success Result Code */
    private static final int SUCC_CODE = 1;

    /** Throwable Failure Code */
    private static final int FAIL_THROWABLE_CODE = 999999999;
    /** Default Failure Code */
    private static final int FAIL_DEFAULT_CODE = 999999000;

    /**
     * 校验Result是否成功
     * @param result Result
     * @return
     */
    public static boolean isSucc(Result result) {
        return result != null && result.getCode() == SUCC_CODE;
    }

    /**
     * 创建成功的Result
     * @return
     */
    public static Result success() {
        return new Result(SUCC_CODE);
    }

    /**
     * 创建默认失败的Result
     * @return
     */
    public static Result failure() {
        return failure(FAIL_DEFAULT_CODE, "FAIL_DEFAULT_NAME", "FAIL_DEFAULT_DESC");
    }

    /**
     * 创建异常失败的Result
     * @param throwable 异常信息
     * @return
     */
    public static Result failure(Throwable throwable) {
        return failure(FAIL_THROWABLE_CODE, throwable.getClass().getSimpleName(), throwable.getMessage());
    }

    /**
     * 创建失败的Result
     * @param failCode 失败码
     * @param failName 失败名称
     * @param failDesc 失败描述
     * @return
     */
    public static Result failure(int failCode, String failName, String failDesc) {
        return failure(new Failure(failCode, failName, failDesc));
    }

    /**
     * 创建失败的Result
     * @param failure 失败的详细信息
     * @return
     */
    public static Result failure(@Nonnull Failure failure) {
        return new Result(FAIL_CODE, failure);
    }
}
