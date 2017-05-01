package strawman.collection.mutable

import strawman.collection
import strawman.collection.IterableFactory

trait Iterable[A] extends collection.Iterable[A]
                     with collection.IterableOps[A, Iterable, Iterable[A]]

object Iterable
  extends IterableFactory.Delegate[Iterable](ArrayBuffer)
