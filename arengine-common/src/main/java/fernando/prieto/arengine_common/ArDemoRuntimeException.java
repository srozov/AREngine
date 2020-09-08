/**
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fernando.prieto.arengine_common;

/**
 * The exception class when the AR sample code runs. Sometimes,
 * you need to capture exceptions to keep your program running.
 *
 * @author HW
 * @since 2020-03-25
 */
public class ArDemoRuntimeException extends RuntimeException {
    /**
     * Constructor.
     */
    public ArDemoRuntimeException() {
        super();
    }

    /**
     * Constructor.
     *
     * @param message message
     */
    public ArDemoRuntimeException(String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message message
     * @param cause cause
     */
    public ArDemoRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}