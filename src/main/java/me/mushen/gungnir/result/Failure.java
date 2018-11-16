package me.mushen.gungnir.result;

import com.google.common.base.Strings;

/**
 * @Desc 错误详情, 包括: 错误码, 错误名称, 错误详情
 * @Author Mushen
 * @Create 2018-06-30
 */
public class Failure {
    /** 错误码 */
    private int failCode;

    /** 错误名称 */
    private String failName;

    /** 错误详情 */
    private String failDesc;

    public Failure(int failCode, String failName, String failDesc) {
        this.failCode = failCode;
        this.failName = failName;
        this.failDesc = failDesc;
    }

    public int getFailCode() {
        return failCode;
    }

    public String getFailName() {
        return Strings.nullToEmpty(failName).trim();
    }

    public String getFailDesc() {
        return Strings.nullToEmpty(failDesc).trim();
    }

    @Override
    public String toString() {
        return "Failure{" +
                "code: " + failCode +
                ", name: '" + failName + '\'' +
                ", desc: '" + failDesc + '\'' +
                '}';
    }
}
