package org.assertj.core.api;

import java.util.List;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IListAssert<T>
		extends Assert<ListAssert<T>, List<T>>, ObjectEnumerableAssert<ListAssert<T>, T>,
		IndexedObjectEnumerableAssert<ListAssert<T>, T> {
}
