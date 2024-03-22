class Solution:
    def calPoints(self, operations: List[str]) -> int:        
        l=[]
        for i in operations:
            if(i=="C"):
                del l[-1]
            elif(i=="D"):
                m=2*int(l[-1])
                l.append(int(m))
            elif(i=="+"):
                s=int(l[-1])+int(l[-2])
                l.append(int(s))
            else:
                l.append(int(i))
        return sum(l)   


    
            

        