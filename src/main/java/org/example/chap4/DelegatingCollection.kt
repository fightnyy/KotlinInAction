package org.example.chap4


// by 키워드를 사용하지 않을 때

//class DelegatingCollection<T> : Collection<T> {
//    private val innerList = arrayListOf<T>()
//    override val size: Int
//        get() = innerList.size
//
//    override fun isEmpty() = innerList.isEmpty()
//
//
//    override fun iterator() = innerList.iterator()
//
//    override fun containsAll(elements: Collection<T>) = innerList.containsAll(elements)
//
//
//    override fun contains(element: T): Boolean = innerList.contains(element)
//}

class DelegatingCollection<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList