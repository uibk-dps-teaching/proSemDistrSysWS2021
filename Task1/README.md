

## Task 1: "First steps the Java SDK of AWS"

### Goals of the task:

* Setting up the environment for the development of Java programs accessing AWS services
* Creating, monitoring, and terminating an EC2 instance

### Step 1 - Setup.

1. Clone the exercise project from its GitHub repository
2. Build the project---i.e. download the project dependencies defined in the  _build.gradle_  file and compile the project---using gradle:

> `gradle build`  

3. (Optional, in case you use Eclipse) Configure the Eclipse project using gradle:  

> `gradle eclipse`
        
### Step 2 - Opt4J Tutorial.

1. Read the first and the second sections of the [Opt4J Tutorial](http://opt4j.sourceforge.net/documentation/3.0/tutorial.xhtml) (Defining Optimization Problems). Try to understand the purpose of _Creators_, _Decoders_, and _Evaluators_.
2. Run the _Hello World_ example within the exercise project:
   > Right click on the _HelloWorld.launch_ file in _./launches_ -> Run as ->      HelloWorld -> Click the "Run" Button in the configurator 

   Familiarize yourself with the Opt4J configurator and -viewer.

### Step 3 - Implementing an optimization.

1. Think of a problem you would like to optimize
2. Implement this optimization within the exercise project by adding code within the classes
   * _MyFirstCreator.class_
   * _MyFirstDecoder.class_
   * _MyFirstEvaluator.class_

**_Note:_**  To run the optimization defined by the above classes:
> Right click on _MyFirstProblem.launch_ file in _./launches_ -> Run as -> MyFirstProblem ->Click the "Run" Button in the configurator
    
