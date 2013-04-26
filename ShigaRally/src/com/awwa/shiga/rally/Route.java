package com.awwa.shiga.rally;

public class Route
{
	@SuppressWarnings("unused")
	private static final String TAG = Route.class.getSimpleName();
	private final Route self = this;

	private Node mSrcNode, mDstNode;
	private int mCost;

	public Route(Node srcNode, Node dstNode, int cost)
	{
		this.mSrcNode = srcNode;
		this.mDstNode = dstNode;
		this.mCost = cost;
	}

	public Node getSrcNode()
	{
		return mSrcNode;
	}

	public Node getDstNode()
	{
		return mDstNode;
	}

	public int getCost()
	{
		return mCost;
	}
}
