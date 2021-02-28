# LastElement, Table, Queue, Stack.


## Introduction

This project is used to display Last Element, Table, Stack List and Queue List in SBT using Scala programming Language.


## Technology

Last Element, Table, Stack List and Queue List is implemented in Scala programming language. Scalatest was used for testing Last Element, Table, Stack List and Queue List's implementation and SBT for project building.


## Requirements

* Java 11
* Scala 2.13.5
* sbt 1.4.7


## Commands

###clean

This command cleans the sbt project by deleting the target directory. The command output relevant messages.

 ```
 sbt clean 
 ```

###compile
This command compiles the scala source classes of the sbt project.

```
 sbt compile 
 ```
###Run
Enter the project folder and type:
```
 sbt run 
 ```


### Tests

Code is developed by applying [TDD](https://en.wikipedia.org/wiki/Test-driven_development) and tests are located in
folder **/src/test/scala-2.13**,  For running all tests enter the project folder and type:

 ```
 sbt test
 ```

## Library dependencies

* scalatest - test driven development
* scoverage

More details about project libraraies (e.g. version etc..) can be found in file **build.sbt**




## Functionality


### Last Element


This functionality returns Lenght of the list and Last element of the list

e.g.

 ```
 (1,5,3,9,11) == 11
 ```

### Table

This functionality returns the table of the element.

e.g.

```
 2 == 2 * 1 = 2.........2 * 10 = 20
 ```

### Stack List

This functionality supports stack implementation.

e.g.

```
stack.push(5) 
                           5
 4                         4
 3         ----->          3 
 2                         2
 1                         1
 
 ```

### Queue List

This functionality supports Queue implementation.

e.g.

```
 (1,2,3,4)
 enqueue(5)
 (1,2,3,4,5)
 
 ```
A number of samples is given in test file are:
* LastElementSpec
* TableSpec
* StackListSpec
* QueueListSpec


Source files that are implementing this functionality are:

* LastElement.scala
* Table.scala
* QueueList.scala
* StackList.scala