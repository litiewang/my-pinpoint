/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.plugin.gson;

import com.navercorp.pinpoint.common.trace.AnnotationKey;
import com.navercorp.pinpoint.common.trace.AnnotationKeyFactory;
import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

/**
 * @author Woonduk Kang(emeroad)
 */
public final class GsonConstants {
    private GsonConstants() {
    }

    public static final ServiceType GSON_SERVICE_TYPE = ServiceTypeFactory.of(5010, "GSON");
    public static final AnnotationKey GSON_ANNOTATION_KEY_JSON_LENGTH = AnnotationKeyFactory.of(9000, "gson.json.length", com.navercorp.pinpoint.common.trace.AnnotationKeyProperty.VIEW_IN_RECORD_SET);
}
