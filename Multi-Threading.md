1. What happens if you call start() twice on the same Thread object?
Trick: You might think it restarts the thread, but it doesn’t.

Answer: Calling start() twice on the same Thread instance throws an IllegalThreadStateException. Once a thread is started and completes (or is in the process of running), it cannot be restarted. You’d need to create a new Thread instance.

2. Can a synchronized method and a non-synchronized method run simultaneously in the same object?
Trick: Synchronization locks the object, but what about unsynchronized code?

Answer: Yes, they can run simultaneously. A synchronized method locks the object’s monitor, but a non-synchronized method doesn’t require the lock, so it can execute concurrently with a synchronized method in a different thread.

3. What’s the difference between wait() and sleep()?
Trick: Both pause a thread, but their behavior differs significantly.

Answer: 
wait() releases the monitor (lock) it holds and waits for a notify() or notifyAll() call, typically used in object synchronization.

sleep() keeps the monitor (if held) and pauses the thread for a specified time without releasing locks. 

Bonus: wait() must be called within a synchronized block/method; sleep() doesn’t have this requirement.

4. Why might volatile not be enough to ensure thread safety?
Trick: volatile ensures visibility, but what about atomicity?

Answer: volatile guarantees that changes to a variable are visible across threads, but it doesn’t ensure atomic operations. For example, i++ (read-modify-write) isn’t atomic, so multiple threads could still overwrite each other’s updates. You’d need synchronized or AtomicInteger for that.

5. What’s the output of this code?

`public class Tricky {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.print("A");
        });
        t.run();
        System.out.print("B");
    }
}`