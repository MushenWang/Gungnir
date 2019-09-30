package me.mushen.gungnir.result;

import java.util.Collection;
import java.util.Collections;

/**
 * @Desc Page Result
 * @Author Mushen
 * @Create 2019-01-14
 */
public final class PageResult<T> extends CollectionResult<T> {
    /** 分页信息 */
    private Page page;

    private PageResult(Result result, Page page, Collection<T> values) {
        super(result, values);
        this.page = page;
    }

    /**
     * Success Page Result
     * @param totalCount
     * @param pageNumber
     * @param pageSize
     * @param values
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> success(int totalCount, int pageNumber, int pageSize, Collection<T> values) {
        return success(Page.page(totalCount, pageNumber, pageSize), values);
    }

    /**
     * Success Page Result
     * @param page
     * @param values
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> success(Page page, Collection<T> values) {
        return of(Result.success(), page, values);
    }

    /**
     * Failure Page Result
     * @param result
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> failure(Result result) {
        return failure(result, null);
    }

    /**
     * Failure Page Result
     * @param result
     * @param page
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> failure(Result result, Page page) {
        return of(result, page, Collections.emptyList());
    }

    /**
     * Create Page Result
     * @param result
     * @param page
     * @param values
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> of(Result result, Page page, Collection<T> values) {
        return new PageResult<>(result, page, values);
    }

    /**
     * Get Page
     * @return
     */
    public Page getPage() {
        return page;
    }

    /**
     * 是否最后一页
     * @return
     */
    public boolean isLastPage() {
        return page == null || page.isLastPage();
    }

    /**
     * 是否严格意义上的最后一页
     * @return
     */
    public boolean isStrictLastPage() {
        return isLastPage() && (values == null || values.size() == 0);
    }

    @Override
    public String toString() {
        return  '{' +
                "result=" + result +
                ", page=" + page +
                ", values=" + values +
                '}';
    }
}
