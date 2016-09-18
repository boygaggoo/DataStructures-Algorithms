
public class Gravity {
      public double falling(double time, double velo){
        //d=v_0*t + 0.5*a*t^2
    	return velo*time+0.5*9.8*time*time;
      }
  }