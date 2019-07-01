# Java RMI Example

### Try the example:
* Bring up a terminal and start registry
```
$ rmiregistry
```
* Bring up a new terminal and compile the source code 
```
$ cd <src_directory>
$ javac -cp $CLASSPATH:../src/ -d <target_directory_for_compiled_class_files> *.java
``` 
* Start the service
```
$ cd <target_directory_for_compiled_class_files>
$ java AddServer
```
* Bring up a new terminal to use a client to make a remote method invocation to our service
```
$ cd <target_directory_for_compiled_class_files>
$ java Client 127.0.0.1
``` 

### Five steps for making the remote service:
1. Make a Remote Interface defining the methods that a client can call remotely
    * Extend java.rmi.Remote
    * Declare that all methods throws a RemoteException
    * Be sure arguments and return values are primitives or Serializable
2. Make a Remote Implementation that does the real work
    * Implement the Remote Interface
    * Extend UnicastRemoteObject
    * Write a no-arg constructor that declares a RemoteException
    * Register the service with the RMI registry by using the static rebind() method of the java.rmi.Naming class
3. Generate the stubs and skeletons using rmi (Deprecated)
4. Bring up a terminal and start registry
5. Bring up a terminal and start the service

References:
1. Head First Design Patterns - Eric Freeman et. al.