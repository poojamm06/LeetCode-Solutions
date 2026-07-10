class Solution {
    public int canCompleteCircuit(int[] g,int[] c){
        int tot=0,tank=0,start=0;
        for(int i=0;i<g.length;i++){
            int gain = g[i]-c[i];
            tot+=gain;
            tank+=gain;
            if(tank<0){
                start=i+1;
                tank=0;
            }

        }
    if(tot<0)
    return -1;
    return start;
    }
    }

