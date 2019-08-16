package me.mushen.gungnir.result;

import com.google.common.base.Strings;

/**
 * @Desc 错误详情, 包括: 错误码, 错误名称, 错误详情
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class Failure {
    /** 默认的错误码 */
    private static final int DEFAULT_FAIL_CODE = 999;
    /** 默认的错误名称 */
    private static final String DEFAULT_FAIL_NAME = "Default";

    /** 异常错误码 */
    private static final int THROWABLE_FAIL_CODE = 500;
    /** 异常错误名称 */
    private static final String THROWABLE_FAIL_NAME = "Internal Server Error";


    /** 错误码 */
    private final int failCode;

    /** 错误名称 */
    private final String failName;

    /** 错误详情 */
    private final String failDesc;

    /** private constructor */
    private Failure(int failCode, String failName, String failDesc) {
        this.failCode = failCode;
        this.failName = failName;
        this.failDesc = failDesc;
    }

    /**
     * 创建错误详情
     * @param failCode 错误码
     * @param failName 错误名称
     * @param failDesc 错误详情
     * @return
     */
    public static Failure failure(int failCode, String failName, String failDesc) {
        return new Failure(failCode, failName, failDesc);
    }

    /**
     * 创建默认的Failure
     * @return
     */
    public static Failure failure() {
        return failure("服务器内部错误");
    }

    /**
     * 使用默认的错误码和错误名称, 创建错误详情
     * @param failDesc 错误详情
     * @return
     */
    public static Failure failure(String failDesc) {
        return failure(DEFAULT_FAIL_CODE, DEFAULT_FAIL_NAME, failDesc);
    }

    /**
     * 使用异常栈, 创建错误详情
     * @param throwable 异常栈
     * @return
     */
    public static Failure failure(Throwable throwable) {
        return failure(THROWABLE_FAIL_CODE, THROWABLE_FAIL_NAME, throwable.getMessage());
    }

    /**
     * 获取错误码
     * @return
     */
    public int getFailCode() {
        return failCode;
    }

    /**
     * 获取错误名称
     * @return
     */
    public String getFailName() {
        return Strings.nullToEmpty(failName).trim();
    }

    /**
     * 获取错误描述
     * @return
     */
    public String getFailDesc() {
        return Strings.nullToEmpty(failDesc).trim();
    }

    @Override
    public String toString() {
        return  "{" +
                "错误码: " + getFailCode() + ", " +
                "错误名称: " + getFailName() + ", " +
                "错误详情: " + getFailDesc() +
                "}";
    }
}
