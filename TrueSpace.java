public class TrueSpace {
      public long calculateSpace(int[] sizes, int clusterSize) {
    	 long tot = 0;
         for(int i=0; i<sizes.length; i++){
        	 if(sizes[i]<=clusterSize && sizes[i]!=0){
        		 tot += clusterSize;
        	 }
        	 else if(sizes[i] > clusterSize){
        			 tot += Math.ceil(1.0*sizes[i]/clusterSize)*clusterSize;
        	 }
         }
         return tot;
      }
   }

