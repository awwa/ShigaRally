package com.awwa.shiga.rally;

public class Dijkstra
{
	@SuppressWarnings("unused")
	private static final String TAG = Dijkstra.class.getSimpleName();
	private final Dijkstra self = this;

	/**
	 * 
	 * @param routes
	 */
	public void calc(Route[] routes)
	{
		while (true)
		{
			boolean cont = false;

			// 定義済みの各ルート毎にループして見ていく
			for (Route route : routes)
			{
				Node src = route.getSrcNode();
				Node dst = route.getDstNode();
				// 元ノードが無い場合無視
				if (src.getFrom() == null)
					continue;
				// 
				if (dst.getFrom() == null
						|| src.getTotalCost() + route.getCost() < 
						dst.getTotalCost())
				{
					dst.setFrom(src);
					dst.setTotalCost(src.getTotalCost() + route.getCost());
					cont = true;
				}
			}
			if (!cont)
				break;
		}
	}
}
