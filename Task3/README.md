

## Task 3: "Automated usage of Docker containers."

### Learning goals of the task:

* Creation of Docker images
* Pushing Docker images to Docker Hub
* Pulling Docker images from Docker Hub
* Automated usage of Docker containers on VMs:
	* Installing Docker on a VM
	* Pulling a Docker image
	* Running an application in Docker
	* Retrieving results from a Docker container


### Step 1 - Setup.

1. Clone the exercise project from its  [GitHub repository](https://github.com/FedorSmirnov89/proSemDistrSysWS2021/tree/master/Task3)
2. Build the project (same procedure as for Tasks 1 and 2)
        
### Step 2 - Creation and Upload of a Docker image.

1. Have a look at the [Docker tutorial](https://docker-curriculum.com/#introduction) (the parts up until the 'Beanstalk' section are particularly useful for this task).
2. Apply the things you learned to create a Docker image of _calc\_fib.jar_ (the application from the previous task).
3. Upload the created image to Docker Hub.

**_Note:_** You may want to test that the docker image showcases the correct behavior by running the corresponding container on your local machine. In particular, make sure that your Docker container is able to access external files (input and output of the fibonacci calculation).

### Step 3 - Automated Usage of Docker Containers on a VM.

Using the things you learned in the previous task, implement a Java program which will:

1. Start an EC2 instance.
2. Install and start Docker on the instance.
3. Pull the Docker image you created in Step 2.
4. Run the docker image.
5. Download the result of the calculation to your local machine.
6. Terminate the instance.

### Step 4 - Measurement and Discussion.

1. Measure the time required for the Tasks 1.-6. of the previous step, as well as the time required for the complete execution of the application.
2. Compare the results of the measurement to the time required for the execution of the application from Task 2, in particular w.r.t. the initialization overhead.

### Upload.

In order to pass the task, you have to upload all **_.java files_** used in your solution, the **_Dockerfile_** used to build the Docker container, as well as a **_text file_** containing a description and discussion of your measurement results.


