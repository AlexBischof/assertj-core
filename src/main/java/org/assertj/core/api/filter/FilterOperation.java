/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.core.api.filter;

/**
 * Common class for filteroperations such as notin, in or not.
 *
 * @author Alexander Bischof
 */
public abstract class FilterOperation<T> {

    protected final T propertyValue;

    protected FilterOperation(T propertyValue) {
        this.propertyValue = propertyValue;
    }

    public abstract <A> Filters<A> apply(Filters<A> filters);

    abstract boolean filter(Object propertyValueOfCurrentElement);
}
