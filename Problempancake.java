import java.util.HashSet;
import java.util.Set;

////Not Finished
public class Problempncakes extends Problem {

	static final int n = 6;
    static final int ssBig  = 5;
	static final int sLarge= 4; 
	static final int  large= 3;
	static final int mid = 2;
	static final int small = 1;
    static final int sssmall = 0;
    //0 means didnot get over the river
    //1 means get over the river
boolean goal_test(Object state){
	Problempancakes carrying_state = (Problempancakes) state;

	if(carrying_state.stateA[sssmall] == 0&&carrying_state.stateA[small] == 1&&carrying_state.stateA[mid] == 2&&carrying_state.stateA[large] ==3
        &&carrying_state.stateA[sLarge]==4&&carrying_state.stateA[ssBig]==6){
		return true;
	}else{
		return false;
	}
}
Set<Object> getSuccessors(Object state) {
	
    Set<Object> set = new HashSet<Object>();
    StateofPancakes s = (StateofPancakes) state;
    //int i0 = s.i0, j0 = s.j0;
    
    StateofPancakes successorS; //successor state
        //Only farmer on the boat!


    
    return set;
}

double step_cost(Object fromState, Object toState) { 
    return 1; 
}

public double h(Object state){
	return 0;
}

public static void main(String[] args) throws Exception {

	Problempancke problem = new Problempancke();
	//1 represent 
	int[] init = {0,1,3,5,2,4};
	//int[] init2 = new int[n];
	problem.initialState = new StateofPancakes(init); 
	
	Search search  = new Search(problem);
	
	System.out.println("TreeSearch------------------------");
	System.out.println("BreadthFirstTreeSearch:\t\t" + search.BreadthFirstTreeSearch());
	System.out.println("UniformCostTreeSearch:\t\t" + search.UniformCostTreeSearch());
	System.out.println("DepthFirstTreeSearch:\t\t" + search.DepthFirstTreeSearch());
	System.out.println("GreedyBestFirstTreeSearch:\t" + search.GreedyBestFirstTreeSearch());
	System.out.println("AstarTreeSearch:\t\t" + search.AstarTreeSearch());
	
	System.out.println("\n\nGraphSearch----------------------");
	System.out.println("BreadthFirstGraphSearch:\t" + search.BreadthFirstGraphSearch());
	System.out.println("UniformCostGraphSearch:\t\t" + search.UniformCostGraphSearch());
	System.out.println("DepthFirstGraphSearch:\t\t" + search.DepthFirstGraphSearch());
	System.out.println("GreedyBestGraphSearch:\t\t" + search.GreedyBestFirstGraphSearch());
	System.out.println("AstarGraphSearch:\t\t" + search.AstarGraphSearch());
	
	System.out.println("\n\nIterativeDeepening----------------------");
	System.out.println("IterativeDeepeningTreeSearch:\t" + search.IterativeDeepeningTreeSearch());
	System.out.println("IterativeDeepeningGraphSearch:\t" + search.IterativeDeepeningGraphSearch());
}

}