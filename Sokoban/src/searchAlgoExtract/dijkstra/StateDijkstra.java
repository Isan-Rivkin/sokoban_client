package searchAlgoExtract.dijkstra;

import java.util.List;

import searchAlgoExtract.Action;
import searchAlgoExtract.State;

public class StateDijkstra<T> 
{
	private T state;
	private double cost;
	private State<T> cameFrom;
	private Action action;
	private List<Action> preActions;
	
	public StateDijkstra(T state, double cost)
	{
		this.state = state;
		this.cost = cost;
		this.action=null;
		this.preActions = null;
	}

	
	
	public List<Action> getPreActions()
	{
		return preActions;
	}



	public void setPreActions(List<Action> preActions)
	{
		this.preActions = preActions;
	}



	public T getState()
	{
		return state;
	}

	public void setState(T theState)
	{
		this.state = theState;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	public State<T> getCameFrom() 
	{
		return cameFrom;
	}

	public void setCameFrom(State<T> cameFrom)
	{
		this.cameFrom = cameFrom;
	}
	
	public Action getAction()
	{
		return action;
	}

	public void setAction(Action action)
	{
		this.action = action;
	}

	@Override
	public boolean equals(Object obj) 
	{
		State<T> s=(State<T>)obj;
		return state.equals(s.getState());
	}
	
	@Override
	public int hashCode() 
	{
		return state.hashCode();
	}
//
//	@Override
//	public int compareTo(State<T> s)
//	{
//		return (int) (this.cost-s.cost);
//	}
//	
//	
	

}
