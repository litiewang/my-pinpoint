/*
 * Copyright 2016 NAVER Corp.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.bootstrap.interceptor;

import java.util.Objects;

/**
 * @author jaehong.kim
 */
public class ExceptionHandleAroundInterceptor1 implements AroundInterceptor1 {

    private final AroundInterceptor1 delegate;
    private final ExceptionHandler exceptionHandler;

    public ExceptionHandleAroundInterceptor1(AroundInterceptor1 delegate, ExceptionHandler exceptionHandler) {
        this.delegate = Objects.requireNonNull(delegate, "delegate");
        this.exceptionHandler = Objects.requireNonNull(exceptionHandler, "exceptionHandler");
    }

    @Override
    public void before(Object target, Object arg0) {
        try {
            this.delegate.before(target, arg0);
        } catch (Throwable t) {
            exceptionHandler.handleException(t);
        }
    }

    @Override
    public void after(Object target, Object arg0, Object result, Throwable throwable) {
        try {
            this.delegate.after(target, arg0, result, throwable);
        } catch (Throwable t) {
            exceptionHandler.handleException(t);
        }
    }
}