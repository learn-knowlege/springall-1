/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.shinnlove.springall.service.tasks;

/**
 * 使用其他线程开启异步能力的Runnable任务。
 *
 * @author shinnlove.jinsheng
 * @version $Id: AsyncTaskWithoutResult.java, v 0.1 2017-07-31 下午3:31 shinnlove.jinsheng Exp $$
 */
@FunctionalInterface
public interface AsyncTaskWithoutResult extends Runnable {

    /**
     * @see Runnable#run()
     */
    @Override
    default void run() {
        startAsyncTask();
    }

    /**
     * 离开主线程开启一个异步任务动作。
     */
    void startAsyncTask();

}