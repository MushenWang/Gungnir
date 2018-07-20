package me.mushen.gungnir.result;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * @Desc
 * @Author Mushen
 * @Create 2018-06-30
 */
@Getter
@ToString
public class Result {
    // Result Code: success(1), failure(0)
    private int code;
    // Detail Failure Information
    private List<Failure> failures;

    public Result(int code) {
        this(code, null);
    }

    public Result(int code, List<Failure> failures) {
        this.code = code;
        this.failures = failures;
    }
}
