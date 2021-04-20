# javaGuide

##목차
* [Annotation](https://github.com/dohyung97022/javaGuide/tree/master/com/annotation)
    * [Create](https://github.com/dohyung97022/javaGuide/blob/master/com/annotation/Create.java)
    * [Basic](https://github.com/dohyung97022/javaGuide/blob/master/com/annotation/Basic.java)
      * @Override
      * @Deprecated
      * @SuppressWarning
      * @FunctionalInterface
  * [MetaAnnotation](https://github.com/dohyung97022/javaGuide/blob/master/com/annotation/Meta.java)
      * @Documented
      * @Inherited
      * @Retention
      * @Repeatable
      * @Target


* [java.util.function](https://github.com/dohyung97022/javaGuide/blob/master/com/Functional/Functionall.java)
    * [Basic]()
        * Runnable
        * Consumer
        * Supplier
        * Function
        * Predicate
        * UnaryOperator
        * Bi
    * [Usage]()
        * collection.removeIf
        * iterable.forEach
        * list.replaceAll
        * map.compute
        * map.computeIfAbsent
        * map.computeIfPresent
        * map.merge
        * map.forEach

  

* [Calender](https://github.com/dohyung97022/javaGuide/tree/master/com/calender)
  * [Create]()
  * [Get]()
  * [Set]()
  * [Clear]()
  * [Add / Roll]()
    

* [Class]()
    * [Abstract]()
    * [Anonymous]()
    * [Array of different Classes]()
    * [Capsulization]()
    * [Casting]()
        * [UpCasting]()
        * [DownCasting]()
    * [Constructor]()
    * [InnerClass]()
    * [Object Class]()
    * [Override]()
    * [Polymorphism]()
    

* [Interface]()
    * public static final variable
    * public abstract function
    * default function


* [Arrays]()
  * Arrays.toString
  * Arrays.deepToString
  * Arrays.copyOf
  * Arrays.copyOfRange
  * Arrays.equals
  * Arrays.deepEquals
  * Arrays.asList
  * Arrays.binarySearch
  * Arrays.sort
    

* [Collection]()
    * [Iterator]()
      * Create
      * iterator.hasNext
      * iterator.next
      * iterator.remove
    * [List]()
      * [ArrayList]()
      * [LinkedList]()
      * [Queue]()
        * queue.add
        * queue.offer
        * queue.remove
        * queue.poll  
      * [Stack]()
        * stack.push
        * stack.peek
        * stack.pop
        * stack.search
        * stack.empty  
      * [list]()
        * list.add
        * list.addAll
        * list.indexOf
        * list.lastIndexOf
        * list.remove
        * list.set
        * Collections.sort(list)
    * [Set]()
        * [HashSet]()
          * equals
          * hashCode
          * LinkedHashSet  
        * [TreeSet]()
          * treeSet.first
          * treeSet.last
          * treeSet.ceiling
          * treeSet.floor
          * treeSet.higher
          * treeSet.lower
          * treeSet.subSet
          * treeSet.headSet
          * treeSet.tailSet
    * [Collection]()
      * collection.add
      * collection.addAll
      * collection.clear
      * collection.contains
      * collection.containsAll
      * collection.isEmpty
      * collection.remove
      * collection.removeAll
      * collection.retainAll
      * collection.size
    * [Collections]()
        * Collections.synchronizedList
        * Collections.synchronizedSet
        * Collections.synchronizedMap
        * Collections.checkedList
        * Collections.checkedSet
        * Collections.checkedMap
    
        
* [Map]()
  * [HashMap]()
    * loadFactor
  * [TreeMap]()
  * [map]()
    * map.put
    * map.putAll
    * map.clear
    * map.get
    * map.remove
    * map.size
    * map.containsKey
    * map.containsValue
    * map.keySet
    * map.vales

    
* [Compare]()
    * Comparable
    * Comparator
    * sort

    
* [Enum]()
    * enum.valueOf
    * enum.name
    * enum.ordinary
    

* [Exception]()
    * [Method exceptions]()
    * [Multi Catch Block]()
    * [exception]()
        * exception.printStackTrace
        * exception.getMessage
        

* [Format]()
    * [SimpleDateFormat]()
        * simpleDateFormat.format
        * simpleDateFormat.parse
        * format keywords
    * [DeciFormat]()
        * deciFormat.format
        * deciFormat.parse
    
* [Generics]()
    * Generic Class
    * Generic Function
    * \<? extends Class>
    * \<? super Class>


* [Named For Loop]()


* [Input]()
    * [String[] args]()
    * [Scanner]()
    

* [Lambda]()
    * @FunctionalInterface
    * java.util.function
    

* [Math]()
    * Math.min
    * Math.max
    * Math.random
    * Math.round
    * Math.abs
    * Math.floor
    * Math.ceil
 
   
* [Operators]()
    * [? Operator]()
    * [Lost Values]()
    * [Prefix, PostFix Operator]()


* [Optional]()
    * Create
    * Optional.of
    * optional.get
    * optional.orElse
    * optional.orElseGet
    * optional.orElseThrow
 
   
* [Stream]()
    * [Create]()
        * Arrays.stream
        * collection.stream
        * Stream.of  
        * Stream.iterate
        * Stream.generate  
        * Stream.range
    * [Mid operation]()
        * stream.skip
        * stream.limit
        * stream.distinct
        * stream.filter
        * stream.sorted
        * stream.map
        * stream.flatMap
    * [Final operation]()
        * stream.count
        * stream.sum
        * stream.max
        * stream.min
        * stream.forEach
        * stream.forEachOrdered
        * stream.allMatch
        * stream.anyMatch
        * stream.noneMatch
        * stream.findMatch
        * stream.findFirst
        * stream.findAny
        * stream.toArray
        * stream.reduce
            * reduce -> count
            * reduce -> sum
            * reduce -> max
            * reduce -> min
        * stream.collect
            * Collectors.partitioningBy
            * Collectors.groupingBy
            * Collectors.counting
            * Collectors.summingInt
            * Collectors.maxBy
            * Collectors.toList
            * Collectors.toSet
            * Collectors.toMap
    * [Multiprocessing]()
      * stream.sequential
      * stream.parallel
    

* [String]()
    * [string]()
        * "" / null
        * constant pool
        * string.compareTo
        * string.concat
        * string.contains
        * string.endsWith
        * string.indexOf
        * string.lastIndexOf
        * string.split
        * string.join
        * string.substring
        * string.trim
        * String.valueOf
    * [StringBuffer]()
        * Create
        * stringBuffer.equals
        * stringBuffer.append
        * stringBuffer.insert
        * stringBuffer.capacity
        * stringBuffer.length
        * stringBuffer.setLength
        * stringBuffer.reverse
        * stringBuffer.setCharAt
        * stringBuffer.subString
        * stringBuffer.toString
    * [StringBuilder]()
        * Single Threading 
        * Difference with StringBuffer
    

* [Thread]()
    * [thread]()
        * Create
            * extends Thread
            * implements Runnable
        * thread.start
        * thread.join
        * thread.sleep  
        * thread.interrupt
        * thread.setPriority  
        * thread.getState
            * Thread.State.NEW
            * Thread.State.RUNNABLE
            * Thread.State.BLOCKED
            * Thread.State.WAITING
            * Thread.State.TIMED_WAITING
            * Thread.State.TERMINATED
        * Deprecated Methods
            * [Why deprecated?](https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/threadPrimitiveDeprecation.html)
            * thread.stop
            * thread.suspend
            * thread.resume
    * [Daemon]()
        * Usage
        * thread.setDaemon
    * [ThreadGroup]()
        * thread.getThreadGroup
        * threadGroup.getName
        * threadGroup.getMaxPriority
        * threadGroup.activeCount
        * threadGroup.activeGroupCount
        * threadGroup.setDaemon
        * threadGroup.interrupt
        * threadGroup.destroy
        * threadGroup.isDestroyed
    * [Synchronized]()
        * synchronized method
        * synchronized block
        * wait
        * notify
        * [Lock]()
            * Starvation / Fairness
            * [ReentrantLock]()
              * reentrantLock.getHoldCount
              * reentrantLock.getQueueLength
              * reentrantLock.isFair
              * reentrantLock.isHeldByCurrentThread
              * reentrantLock.isLocked
            * DeadLock example
            * lock.lock
            * lock.tryLock
            * lock.lockInterruptibility
            * lock.unlock
        
  
* Variable
    * [All Types]()
        * byte
        * short
        * int
        * long
        * float
        * double
        * char
        * boolean
        * String
    * [Change Types]()
        * char -> int
        * int -> char
        * int -> String
        * String -> int
        * char -> String
        * String -> char
        * String -> double
        * double -> String
    * [Final]()
    * [Hash]()
        * String const pool
        * object.hashCode
        * System.identityHashCode
    * [Literal]()
    * [Modifier]()
        * public
        * protected
        * private
        * abstract
        * native
        * transient
        * synchronized
        * volatile
        * final
    * [OverFlow]()
    * [Printf]()
    * 

* [Design Patterns]()
    * Create
        * [Prototype]()
        * [Factory]()
        * [AbstractFactory]()
        * [Builder]()
        * [Singleton]()
    