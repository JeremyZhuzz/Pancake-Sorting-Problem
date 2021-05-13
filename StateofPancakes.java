public class StateofPancakes{    
    int stateArray[];
    
public StateofPancakes(int[] stateArray) { 
    this.stateArray = stateArray; 
}

//It has to be a copy of values not reference because we will 
//create many states and don't want to overwrite the same array.
public StateofPancakes(StateofPancakes state) {
	stateArray = new int[6];
    for(int i=0; i<6; i++) 
        this.stateArray[i] = state.stateArray[i];
}



public int hashCode() {
    return stateArray[0]*100000 + stateArray[1]*10000 + stateArray[2]*1000 + stateArray[3]*100 + stateArray[4]*10 + stateArray[5];
}    

public String toString(){
    String s = "";
    for (int i=0; i<6; i++)
        s += " " + this.stateArray[i];
    return s;
    }
}