package me.mushen.gungnir.result;

import lombok.Getter;
import lombok.ToString;

/**
 * @Desc Failure Detail Info.
 * @Author Mushen
 * @Create 2018-06-30
 */
@Getter
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
}
