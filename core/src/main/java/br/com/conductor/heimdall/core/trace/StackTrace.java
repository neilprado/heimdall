/*
 * Copyright (C) 2018 Conductor Tecnologia SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.conductor.heimdall.core.trace;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents the stacktrace that can occur when a a filter
 * throws an exception. This stack will be saved to the mongo
 * log.
 */
@Data
@AllArgsConstructor
public class StackTrace {

    private String clazz;

    private String message;

    private String stack;

}