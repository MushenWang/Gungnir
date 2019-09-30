package me.mushen.gungnir.result;

/**
 * @Desc 错误详情, 包括: 错误码, 错误名称, 错误详情, 异常或者错误堆栈信息
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class Failure {
    /** 异常错误码 */
    private static final int THROWABLE_FAIL_CODE = 900500;
    /** 异常错误名称 */
    private static final String THROWABLE_FAIL_NAME = "Server.Error.Internal";

    /** 错误码 */
    private final int failCode;
    /** 错误名称 */
    private final String failName;
    /** 错误详情 */
    private final String failDesc;
    /** 错误或者异常信息 */
    private final Throwable throwable;

    private Failure(int failCode, String failName, String failDesc) {
        this(failCode, failName, failDesc, null);
    }

    private Failure(int failCode, String failName, String failDesc, Throwable throwable) {
        this.failCode = failCode;
        this.failName = failName;
        this.failDesc = failDesc;
        this.throwable = throwable;
    }

    /**
     * 创建错误详情
     * @param failCode 错误码
     * @param failName 错误名称
     * @param failDesc 错误详情
     * @return
     */
    public static Failure of(int failCode, String failName, String failDesc) {
        return new Failure(failCode, failName, failDesc);
    }

    /**
     * 使用异常栈, 创建错误详情
     * @param throwable 异常栈
     * @return
     */
    public static Failure of(Throwable throwable) {
        return new Failure(THROWABLE_FAIL_CODE, THROWABLE_FAIL_NAME, throwable.getMessage(), throwable);
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
        return failName;
    }

    /**
     * 获取错误描述
     * @return
     */
    public String getFailDesc() {
        return failDesc;
    }

    /**
     * 获取错误或者异常信息
     * @return
     */
    public Throwable getThrowable() {
        return throwable;
    }

    @Override
    public String toString() {
        return  '{' +
                "failCode=" + failCode +
                ", failName='" + failName + '\'' +
                ", failDesc='" + failDesc + '\'' +
                ", throwable=" + throwable +
                '}';
    }
}
