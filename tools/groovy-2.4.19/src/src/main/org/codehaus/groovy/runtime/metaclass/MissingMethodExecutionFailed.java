/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.codehaus.groovy.runtime.metaclass;

/**
 * A stack less exception used to indicate, that the execution of a missingMethod
 * method failed with a MissingMethodException. This is used to preven a call to
 * invokeMethod for GroovyObject implementing classes.
 */
public class MissingMethodExecutionFailed extends MissingMethodExceptionNoStack {
    private static final long serialVersionUID = -6551412223364004284L;
    private Throwable cause;
    public MissingMethodExecutionFailed(String method, Class type, Object[] arguments, boolean isStatic, Throwable cause) {
        super(method, type, arguments, isStatic);
        this.cause = cause;
    }

    public Throwable getCause() {
        return cause;
    }
}
