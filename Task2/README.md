

## Task 2: "Automated control of multiple VMs."

### Learning goals of the task:

* Installing software on a VM
* Accessing the VM via SSH to:
	* Copy data from and to the VM
	* Process data on the VM
* Automating the SSH access
* Distributing the workload between multiple VMs

### Step 1 - Setup.

1. Clone the exercise project from its  [GitHub repository](https://github.com/FedorSmirnov89/proSemDistrSysWS2021/tree/master/Task2)
2. Build the project (same procedure as for Task 1)
        
### Step 2 - Manually controlling a single VM via SSH.

1. Create a VM instance (without preinstalled Java) and connect to it using SSH.
2. Connect to the VM using SSH.
3. Install Java 8 on the VM.
4. Use SCP to copy the file _calc\_fib.jar_ to the VM.
5. Execute the file and download the result to your local machine.
6. Terminate the VM.

**_Note:_** You do not have to upload any results of Step 2 as part of your submission of Task 2.

### Step 3 - Controlling a single VM via SSH using a script.

1. Implement a Java script to start a VM and execute the parts 1.-5. from Step 2.
2. Measure the time required for the operation.

**_Note:_** You may want to (a) reuse the code you wrote for the for Task 1 and (b) use [Jsch](http://www.jcraft.com/jsch/) for the automation of the SSH operations (the dependency to Jsch and an example command are included in the task project in the task repository).

### Step 3 - Controlling multiple VMs via SSH using a script.

1. Split the workload by (manually) distributing the content of the input file _input\_full.csv_ between two files _input\_half\_one.csv_ and _input\_half\_two.csv_.
2. Implement a Java script to create and initialize two VMs (install Java, load the files, etc.), send one workload file to each machine, process the workload, and download the results.
3. Measure the time required for processing. 

### Step 4 - Discussion.

1. Investigate how the speedup achieved by using 2 VMs instead of one depends on the way you split the workload file.
2. What is the optimal way to split the file?
