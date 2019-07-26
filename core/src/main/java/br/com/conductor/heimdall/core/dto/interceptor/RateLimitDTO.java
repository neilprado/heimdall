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
package br.com.conductor.heimdall.core.dto.interceptor;

import br.com.conductor.heimdall.core.enums.Interval;
import lombok.Data;

/**
 * Class is a Data Transfer Object for the RateLimit.
 *
 * @author Marcos Filho
 *
 */
@Data
public class RateLimitDTO {

     private Long calls;
     private Interval interval;
}