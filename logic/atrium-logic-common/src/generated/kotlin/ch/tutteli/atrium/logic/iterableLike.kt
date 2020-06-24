//---------------------------------------------------
//  Generated content, modify: 
//  logic/atrium-logic-common/build.gradle 
//  if necessary - enjoy the day 🙂 
//---------------------------------------------------

package ch.tutteli.atrium.logic

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.domain.creating.changers.ExtractedFeaturePostStep


    //TODO add with 0.14.0
//    fun <T : Any, E> iterableLikeContainsBuilder(
//        container: AssertionContainer<T>,
//        converter: (T) -> Iterable<E>
//    ): IterableLikeContains.Builder<T, E, NoOpSearchBehaviour>
//
//    fun <T : Any, E> iterableLikeContainsNotBuilder(
//        container: AssertionContainer<T>,
//        converter: (T) -> Iterable<E>
//    ): IterableLikeContains.Builder<T, E, NotSearchBehaviour>

fun <T : Any, E : Any> AssertionContainer<T>.all(converter: (T) -> Iterable<E?>, assertionCreatorOrNull: (Expect<E>.() -> Unit)?): Assertion =
    _iterableLikeImpl.all(this, converter, assertionCreatorOrNull)

fun <T : Any, E> AssertionContainer<T>.hasNext(converter: (T) -> Iterable<E>): Assertion = _iterableLikeImpl.hasNext(this, converter)

fun <T : Any, E> AssertionContainer<T>.hasNotNext(converter: (T) -> Iterable<E>): Assertion = _iterableLikeImpl.hasNotNext(this, converter)

fun <T : Any, E : Comparable<E>> AssertionContainer<T>.min(converter: (T) -> Iterable<E>): ExtractedFeaturePostStep<T, E> = _iterableLikeImpl.min(this, converter)

fun <T : Any, E : Comparable<E>> AssertionContainer<T>.max(converter: (T) -> Iterable<E>): ExtractedFeaturePostStep<T, E> = _iterableLikeImpl.max(this, converter)
