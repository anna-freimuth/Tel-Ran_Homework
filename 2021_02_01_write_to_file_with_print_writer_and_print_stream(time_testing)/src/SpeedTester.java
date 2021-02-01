import java.util.List;

public class SpeedTester {
    List<SpeedTest> speedTests;
    int times;
    String text;

    public SpeedTester(List<SpeedTest> speedTests, int times, String text) {
        this.speedTests = speedTests;
        this.times = times;
        this.text = text;
    }

   public void test(){
        for(SpeedTest test : speedTests){
           test.printTestName();
           long before = System.currentTimeMillis();
           for(int i= 0; i < times; i ++){
               test.run(text);
           }
           test.close();
           long after = System.currentTimeMillis()-before;
            System.out.println(after + " ms");
        }
   }
}
