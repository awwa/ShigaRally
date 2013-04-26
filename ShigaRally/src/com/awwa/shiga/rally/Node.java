package com.awwa.shiga.rally;

public class Node
{
	@SuppressWarnings("unused")
	private static final String TAG = Node.class.getSimpleName();
	private final Node self = this;

	private char mLabel;
	private int mTotalCost;
	private Node mFrom;

	public Node(char label)
	{
		this(label, null);
	}

	public Node(char label, Node from)
	{
		this.mLabel = label;
		this.mFrom = from;
	}

	public char getLabel()
	{
		return mLabel;
	}

	public Node getFrom()
	{
		return mFrom;
	}

	public int getTotalCost()
	{
		return mTotalCost;
	}

	public void setFrom(Node from)
	{
		this.mFrom = from;
	}

	public void setTotalCost(int totalCost)
	{
		this.mTotalCost = totalCost;
	}

}
