// 3.2.13 Not sure where I would need a for loop this is my best guess
public class StopWatch1 {
 private final long start;
 private long pausedTime;
 private long pausedTimeStart;
 private boolean isPaused;
 public StopWatch1() {
 start = System.currentTimeMillis();
 pausedTime = 0;
 isPaused = false;
 }

         public double pause_stop() {
if (!isPaused) {
 pausedTimeStart = System.currentTimeMillis();
 isPaused = true;
}
 return (pausedTimeStart - start - pausedTime) /1000.0;
 }

         public void resume() {
if (isPaused) {
 long now = System.currentTimeMillis();
 pausedTime += (now - pausedTimeStart);
 isPaused = false;
 }
 }

    public double elapsedTime() {
 long now = System.currentTimeMillis();
 if (isPaused)
 return (pausedTimeStart - start - pausedTime) /1000.0;
 return (now - start - pausedTime) /1000.0;
 }
}