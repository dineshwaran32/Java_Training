package Day4;

public class P6 {
	
	public static void main(String[] args) {
		/*
		 * sleep() - sleeps for a specific period.
		 * suspend() - thread sometime in order to satisfy some condition.
		 * resume() - our suspended method can be resumed using this method.
		 * wait() - to wait for some time .
		 * notify() / notifyAll() - the thread which excepting the call (wait) .
		              			  - the thread which is responsible to perform updation it is responsible to call notify.
		 * yield() - to pass current executing thread and to give the chance for waiting threads of same priority. 
		  			 
		 			 1. threads with higher priority will enter the process. MAX_PRIORITY(10)
		 			 2. if there is no waiting thread or all threads are low priority then same thread can continue its execution. NORM_PRIORITY(5)
		 			 3. if all threads are equal priority thread schedular will decide which can runs the process. MIN_PRIORITY(1)
		 * join() - If a threads wants to wait untill comnpletion of some other thread then we should go for a join.
		   Example: If  a thread T1 wants to wait untill completing T2 then T1 needs to call T2.Join();
		   Every join throws interuppted exception which is a check exception
		   1. a thread can be implemented by extending thread class.
		   2. a thread can be implemented by runnable interface.
		  * the thread instuctions are stored inside the run() method. 
		    but we use start()  to run a run() method. 
		    * When we create a thread object using thread class , thread is born and is known to be in newborn state
		 	When a thread is born, it enters into new state
		 	The start() method has not been called yet on the instance
		  	Only start()  method called a new thread otherwise
		    if(not new thread) then it raise an exception (IllegalThreadStream)
		 */
		
		
		/*
		 * the thread works on the background to enusure the normal flow of a system called a demon threa
		 */
		
		/*
		 * Running means processor has allocated memory slot to  thread for its execution
		 * a thread can come into running satate only from runnable state
		 * A running thread may provide any one of the following situations and can enter into the blocked state
		 */
		
		
		/*
		 * Blocked state
		 * A thread moves to the blocked state when it wants to access an object that another thread has locked. 
		   Once that resource is available  for the thread, it is no longer blocked and moves to the runnable state.
		 */
		
		
		/*
		 * Dead state
		 * the state where a thread has finished executing its "run()" method and can no longer be run again, essentially meaning the thread is terminated or "dead"
		 * this happens when the thread's execution is complete or if it is forcefully stopped using a method like "stop()"
		 */

		/*
		 * Lock
		 * Holding the particular resource without giving access to any other thread to finish the thread job holding the locked thread
		 */
		
		/*
		 * Semaphore
		 * it is present in java.util.concurrent
		 * helps to manage the shared resources thread using counters
		 */
		
		
		
		/*
		 * Shut down 
		 * its triggered by JVM before closing to shutdown any threads
		 */
		
		/*
		 * Cyclic barrier
		 * uses an algorithm to synchronize thread processing such that set of threads waits for each other to complete a common execution point.
		 * 
		 */
		
		/*
		 * Two types multitasking
		  
		  1.  Process based multitasking -  it occurs at os level 
		  2.  Thread based multitasking - it occurs at programming
		  
		  at any given point  of time there is atleast 1 thread running 
		 */
	}
	
}
