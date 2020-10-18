

## Task 1: "First steps the Java SDK of AWS"

### Goals of the task:

* Setting up the environment for the development of Java programs accessing AWS services
* Creating, monitoring, and terminating an EC2 instance

### Step 1 - Setup.

1. Clone the exercise project from its  [GitHub repository](https://github.com/FedorSmirnov89/proSemDistrSysWS2021/tree/master/Task1)
2. Build the project---i.e. download the project dependencies defined in the  _build.gradle_  file and compile the project---using gradle:

> `gradle build`  

3. (Optional, in case you use Eclipse) Configure the Eclipse project using gradle:  

> `gradle eclipse`
        
### Step 2 - AWS Java SDK documentation.

1. Have a look at the documentation of the Java SDK for AWS on the [website](https://docs.aws.amazon.com/sdk-for-java/index.html). Note that, for the tasks within this proseminar, we will be using the SDK Version 1, so read the corresponding parts of the manual.
2. When looking at the manual, you should prioritze the following parts:
	* [First steps](https://docs.aws.amazon.com/de_de/sdk-for-java/v1/developer-guide/getting-started.html)
	* [Code examples for EC2](https://docs.aws.amazon.com/de_de/sdk-for-java/v1/developer-guide/prog-services-ec2.html)
	* [Managing EC2 instances](https://docs.aws.amazon.com/de_de/sdk-for-java/v1/developer-guide/examples-ec2-instances.html)
3. Create a user with a set of credentials and the appropriate rights for the homework task. Download its credentials to your local machine.
	

### Step 3 - Managing an EC2 instance.

Implement a script which will create an EC2 instance, start it, measure the time required to start the instance, and then terminate the instance. More specifically, the script should contain the following steps:

1. Retrieve the credentials
2. Create a key pair to access the EC2 instance
3. Create a security group and set the appropriate authorizations
4. Start the EC2 instance
5. Retrieve the instance ID
6. Measure the time between the startup time of the instance
7. Terminate the instance

To complete the task, upload a .zip file of your project to OLAT.

**_Note:_**  Use the AWS management console to check that each of the steps is executed correctly. In particular, you should make sure that the EC2 instance is terminated after the script has been executed.
    
