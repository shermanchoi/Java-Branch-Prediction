import soot.*;
import soot.tagkit.*;
import soot.jimple.*;
import soot.util.*;
import java.io.*;
import java.util.*;
import soot.toolkits.graph.*;

//Maybe we don't need this...
public class HeuristicIfPair{
	private IfStmt corresponding_if_stmt;
	private int[] heuristic_taken_or_not;
	
	HeuristicIfPair(int count, IfStmt i_s){
		corresponding_if_stmt = i_s;
		heuristic_taken_or_not = new int[count];
	}
	
	public void setTaken(int where, int what){
		heuristic_taken_or_not[where] = what;
	}
	
	public int getTaken(int where){
		return heuristic_taken_or_not[where];
	}
	
	public IfStmt getIfStmt(){
		return corresponding_if_stmt;
	}
}

