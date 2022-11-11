package javaconcurrency;

		// Java Concurrency

/*  Java Concurrency is a term that covers multiThreading,concurrency and 
 *  Parallelism on the java platform.That includes the java Concurrency tools,
 *  Problems and solutions. This Java Concurrency tutorial covers 
 *  the core Concepts of multiThreading,Concurrency constructs,concurrency problems,costs
 *  benefits related to multiThreading in java..
 * 
 * 
 * 
 *      # What is MultiThreading?
 *      	
 *      	(#) MultiThreading means that you have multipleThreads of execution 
 *          inside the same application . A Thread is like a seperate cpu executing 
 *          your application thus,a multithreaded application is like an application that has multiple cpu
 *          is like an application that has multiple cpu executing different parts of the code at the same time.
 * 
 * 			
 * 			(#)	A thread is not equal to cpu through.usually a single cpu will share its execution time among multiple threads,
 * 				switching between executing each of the threads for a given amount of time. it is also possible to have the
 * 				Threads of an application be executed by different cpus. 
 * 
 * 
 * 		# Why MultiThreading?
 * 			
 * 			(#) There are several reasons as to why one would use multithreading in an application.
 * 				Some of the most common reasons for multiThreading are:
 * 
 * 			(#)Better utilization of single cpu
 * 			(#)Better utilization of multiple CPUS or Cpu cores
 * 			(#)Better User experience with regards to responsiveness.
 * 			(#)Better user experience with regards to fairness.	
 * 
 * 			i will explain each of these reasons in more details in the following sections.
 * 
 * 		# Better Utilization of Single CPU
 * 		
 * 			(#)One of the most common reasons is to be able to better utilize the resources in the Computer.
 * 				For instance,if one Thread is Waiting for the response to a request sent over the network,
 * 				Then another thread could use the cpu in the meantime to do something else.Additionally,if the computer has multiple CPUs,
 * 				or if the cpu has multiple execution cores,then multithreading can also help your application utilize these extra cpu cores.	
 * 
 * 		# Better Utilization of Multiple CPUs or CPU Cores
 * 			
 * 			(#)If a computer Contains a multiple CPUs or the cpu Contains multiple Execution cores,then you need to use Multiple Threads 
 * 				for Your application to be able to utilize all of the CPUs or CPU cores.A Single Thread can at most utilize a Single CPU,
 * 				and as i mentioned above,sometimes not even Completely utilize a single cpu			
 * 
 * 
 *		# Better user experience with Regards to Responsiveness
 *		
 *			(#)Another reason to use Multithreading is to provide a better user experience For instance,If you click on a button in a GUI and this
 *				this results in a request being sent over the network,then it matters which thread perform this request.If you use the same thread that is also updating the GUI. 
 * 				Then the User might Experience the GUI"hanging"while GUI Thread is Waiting for the response for tthe request.Instead,such a request could be performed by a BackGround thread
 * 				so the GUI Thread is free to response to other user request in the meantime
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */



























