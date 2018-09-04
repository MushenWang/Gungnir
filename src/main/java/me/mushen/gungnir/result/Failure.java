package me.mushen.gungnir.result;

import com.google.common.base.Strings;
import lombok.ToString;

/**
 * @Desc Failure Detail Info.
 * @Author Mushen
 * @Create 2018-06-30
 */
@ToString
public class Failure {
    // Failure Code
    private int failCode;
    // name
    private String failName;
    // description
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
}
