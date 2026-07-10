class Solution(object):
    def canCompleteCircuit(self, gas, cost):


        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        tot=start=tank=0
        for i in range(len(gas)):
            
            gain=gas[i]-cost[i]
            tot+=gain
            tank+=gain
            if tank<0:
                start=i+1
                tank=0
        if tot<0:
            return -1
        return start
        

